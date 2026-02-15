import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex05_Un03 {
    private Map<String, List<Aresta>> adjacencias;

    public Ex05_Un03() {
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
        Ex05_Un03 grafo = new Ex05_Un03();

        grafo.addArtesta("A", "B", 10);
        grafo.addArtesta("A", "C", 5);
        grafo.addArtesta("B", "C", 3);
        
        grafo.imprimirGrafo();
    }
    
}
