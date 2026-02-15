import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
    private Map<String, List<Aresta>> adjacencias;

    public BFS() {
        adjacencias = new HashMap<>();
    }

    public Map<String, Boolean> buscaPorLargura(String verticeInicial){
        Map<String, Boolean> visitados = new HashMap<>();
        Queue<String> fila = new LinkedList<>();

        for (String vertice: adjacencias.keySet()) {
            visitados.put(vertice, false);
        }

        fila.add(verticeInicial);
        visitados.put(verticeInicial, true);

        while (!fila.isEmpty()) {
            String verticeAtual = fila.poll();
            System.out.print(verticeAtual + " ");

            List<Aresta> vizinhos = adjacencias.get(verticeAtual);
            for (Aresta aresta : vizinhos) {
                if (!visitados.get(aresta.getDestino())) {
                    fila.add(aresta.getDestino());
                    visitados.put(aresta.getDestino(), true);
                }
            }
        }
        
        return visitados;
    }

    public void addVertice(String rotulo) {
        adjacencias.put(rotulo, new ArrayList<>());
    }

    public void addArtesta(String origem, String destino, int peso) {
        if (!adjacencias.containsKey(origem)){
            addVertice(origem);
        }
        if (!adjacencias.containsKey(destino)){
            addVertice(destino);
        }
        adjacencias.get(origem).add(new Aresta(destino, peso));
    }

    public void imprimirGrafo() {
        for (String vertice : adjacencias.keySet()) {
            List<Aresta> arestas = adjacencias.get(vertice);
            System.out.print(vertice + " -> ");
            for (Aresta aresta : arestas){
                System.out.print(aresta.getDestino() + "(" + aresta.getPeso() + ") ");
            }
            System.out.println();
        }

    }

    private class Aresta {
        private String destino;
        private int peso;

        public Aresta(String destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }

        public String getDestino() {
            return destino;
        }

        public int getPeso() {
            return peso;
        }
    }

    public static void main(String[] args) {
        BFS grafo = new BFS();

        grafo.addVertice("Brasil");
        grafo.addVertice("Argentina");
        grafo.addVertice("Inglaterra");
        grafo.addVertice("Portugal");
        grafo.addVertice("China");

        grafo.addArtesta("Brasil", "Japão", 5);
        grafo.addArtesta("Brasil", "Portugal", 10);
        grafo.addArtesta("Portugal", "Brasil", 5);
        grafo.addArtesta("Argentina", "Inglaterra", 20);
        grafo.addArtesta("Argentina", "Portugal", 25);

        grafo.buscaPorLargura("Brasil");
    }
}
