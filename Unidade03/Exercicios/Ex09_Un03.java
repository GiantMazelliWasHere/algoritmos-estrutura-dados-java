import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

class Aresta {
    int destino;
    int peso;

    Aresta(int destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }
}

class NoFila implements Comparable<NoFila> {
    int id;
    int distanciaAcumulada;

    NoFila(int id, int distanciaAcumulada) {
        this.id = id;
        this.distanciaAcumulada = distanciaAcumulada;
    }

    @Override
    public int compareTo(NoFila outro) {
        return Integer.compare(this.distanciaAcumulada, outro.distanciaAcumulada);
    }
}

public class Ex09_Un03 {
    private int V;
    private List<List<Aresta>> adj;

    public Ex09_Un03(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
    }

    public void adicionarAresta(int u, int v, int peso) {
        adj.get(u).add(new Aresta(v, peso));
        adj.get(v).add(new Aresta(u, peso));
    }

    public void dijkstra(int origem, int destino) {
        int[] distancias = new int[V];
        int[] pais = new int[V];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        Arrays.fill(pais, -1);
        
        distancias[origem] = 0;
        PriorityQueue<NoFila> pq = new PriorityQueue<>();
        pq.add(new NoFila(origem, 0));

        while (!pq.isEmpty()) {
            NoFila atual = pq.poll();
            int u = atual.id;

            if (u == destino) break;

            
            if (atual.distanciaAcumulada > distancias[u]) continue;

            for (Aresta aresta : adj.get(u)) {
                int v = aresta.destino;
                int novaDistancia = distancias[u] + aresta.peso;

                if (novaDistancia < distancias[v]) {
                    distancias[v] = novaDistancia;
                    pais[v] = u;
                    pq.add(new NoFila(v, novaDistancia));
                }
            }
        }

        exibirResultado(pais, distancias, origem, destino);
    }

    private void exibirResultado(int[] pais, int[] distancias, int origem, int destino) {
        if (distancias[destino] == Integer.MAX_VALUE) {
            System.out.println("Caminho não encontrado.");
            return;
        }

        Deque<Integer> caminho = new ArrayDeque<>();
        int aux = destino;
        while (aux != -1) {
            caminho.addFirst(aux);
            aux = pais[aux];
        }

        System.out.println("Custo total: " + distancias[destino]);
        System.out.println("Caminho: " + caminho);
    }

    public static void main(String[] args) {
        Ex09_Un03 grafo = new Ex09_Un03(6);

        grafo.adicionarAresta(0, 1, 4);
        grafo.adicionarAresta(0, 2, 2);
        grafo.adicionarAresta(1, 2, 5);
        grafo.adicionarAresta(1, 3, 10);
        grafo.adicionarAresta(2, 4, 3);
        grafo.adicionarAresta(4, 3, 4);
        grafo.adicionarAresta(3, 5, 11);

        int origem = 0;
        int destino = 5;
        
        System.out.println("Encontrando o caminho mais curto de " + origem + " para " + destino + ":");
        grafo.dijkstra(origem, destino);
    }
}
