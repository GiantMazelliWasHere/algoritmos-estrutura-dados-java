import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ex06_Un03 {
    private int V;
    private List<List<Integer>> adj;

    public Ex06_Un03(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void adicionarAresta(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void encontrarCaminhoMaisCurto(int inicial, int destino) {
        if (inicial == destino) {
            System.out.println("Origem e destino são iguais: " + inicial);
            return;
        }

        boolean[] visitado = new boolean[V];
        int[] pai = new int[V];
        Arrays.fill(pai, -1);

        Deque<Integer> fila = new ArrayDeque<>();

        visitado[inicial] = true;
        fila.addLast(inicial);

        boolean encontrado = false;

        while (!fila.isEmpty()) {
            int u = fila.removeFirst();

            if (u == destino) {
                encontrado = true;
                break;
            }

            for (int vizinho : adj.get(u)) {
                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    pai[vizinho] = u;
                    fila.addLast(vizinho);
                }
            }
        }

        if (encontrado) {
            exibirCaminho(pai, destino);
        } else {
            System.out.println("Não existe caminho entre " + inicial + " e " + destino);
        }
    }

    private void exibirCaminho(int[] pai, int destino) {
        LinkedList<Integer> caminho = new LinkedList<>();
        int atual = destino;

        
        while (atual != -1) {
            caminho.addFirst(atual);
            atual = pai[atual];
        }

        System.out.println("Menor caminho: " + caminho);
        System.out.println("Distância (número de arestas): " + (caminho.size() - 1));
    }

    public static void main(String[] args) {
        Ex06_Un03 g = new Ex06_Un03(6);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(2, 4);
        g.adicionarAresta(3, 4);
        g.adicionarAresta(3, 5);
        g.adicionarAresta(4, 5);

        
        g.encontrarCaminhoMaisCurto(0, 5);
    }
}
