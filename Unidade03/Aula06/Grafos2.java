import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafos2 {
    private Map<String, List<Aresta>> adjacencias;

    public Grafos2() {
        adjacencias = new HashMap<>();
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
        Grafos2 grafo = new Grafos2();

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

        System.out.println(grafo.adjacencias);
        System.out.println(grafo.adjacencias.get("Brasil"));
        System.out.println(grafo.adjacencias.get("Brasil").get(0));
        System.out.println(grafo.adjacencias.get("Brasil").get(0).getDestino());
        System.out.println(grafo.adjacencias.get("Brasil").get(0).getPeso());

        grafo.imprimirGrafo();

    }
}
