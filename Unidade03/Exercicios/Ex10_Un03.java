import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Ex10_Un03 {
    private int V;
    private List<List<Integer>> adj;

    public Ex10_Un03(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void adicionarAresta(int u, int v) {
        adj.get(u).add(v);
    }

    public void ordenar() {
        int[] grauEntrada = new int[V];
        for (int i = 0; i < V; i++) {
            for (int vizinho : adj.get(i)) {
                grauEntrada[vizinho]++;
            }
        }

        Deque<Integer> deque = new ArrayDeque<>();
        
 
        for (int i = 0; i < V; i++) {
            if (grauEntrada[i] == 0) {
                deque.addLast(i);
            }
        }

        List<Integer> resultado = new ArrayList<>();

        while (!deque.isEmpty()) {
            int u = deque.removeFirst();
            resultado.add(u);

            for (int vizinho : adj.get(u)) {
                grauEntrada[vizinho]--;
                if (grauEntrada[vizinho] == 0) {
                    deque.addLast(vizinho);
                }
            }
        }

        if (resultado.size() != V) {
            System.out.println("Erro: Ciclo detectado!");
        } else {
            System.out.println("Ordenaçao topologica: " + resultado);
        }
    }

    public static void main(String[] args) {
        Ex10_Un03 g = new Ex10_Un03(6);

        g.adicionarAresta(5, 2);
        g.adicionarAresta(5, 0);
        g.adicionarAresta(4, 0);
        g.adicionarAresta(4, 1);
        g.adicionarAresta(2, 3);
        g.adicionarAresta(3, 1);

        g.ordenar();
    }
}
