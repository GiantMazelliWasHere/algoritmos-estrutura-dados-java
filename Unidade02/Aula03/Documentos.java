import java.util.ArrayDeque;
import java.util.Deque;

public class Documentos {
    private String titulo;
    private int nPaginas;

    public Documentos(String titulo, int nPaginas) {
        this.titulo = titulo;
        this.nPaginas = nPaginas;
    }


    public static void main(String[] args) {
        Deque<Documentos> pilha = new ArrayDeque<>();
        
        Documentos doc = new Documentos("Processo 1", 100 );
        Documentos doc2 = new Documentos("Processo 2", 200 );
        Documentos doc3 = new Documentos("Processo 3", 300 );
        Documentos doc4 = new Documentos("Processo 4", 400 );
        Documentos doc5 = new Documentos("Processo 5", 500 );

        pilha.push(doc);
        pilha.push(doc2);
        pilha.push(doc3);
        pilha.push(doc4);
        pilha.push(doc5);

        while(!pilha.isEmpty()){
            Documentos tempDoc = pilha.pop();
            System.out.println("Título:            " + tempDoc.titulo);
            System.out.println("Número de páginas: " + tempDoc.nPaginas);
            System.out.println(" ");
        }

        
    }
}
