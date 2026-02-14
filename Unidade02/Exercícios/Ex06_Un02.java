import java.util.LinkedList;
import java.util.Queue;

public class Ex06_Un02 {
    public static void addFila(Queue<String> fila, String elemento){
        fila.offer(elemento);
    }
    
    public static void removeFila(Queue<String> fila){
        if(!fila.isEmpty()){
            System.out.println(fila.poll());
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public static void exibirFila(Queue<String> fila){
        if(!fila.isEmpty()){
            for(String elemento : fila){
                System.out.println(elemento);
            }
        }else {
            System.out.println("A fila está vazia.");
        }
    }
    
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        addFila(fila, "Elemento 1");
        addFila(fila, "Elemento 2");
        addFila(fila, "Elemento 3");
        System.out.println("Fila apos adiçao de elementos:");
        exibirFila(fila);
        System.out.println("\nRemovendo elementos da fila:");
        removeFila(fila);
        System.out.println("\nFila após remoçao de um elemento:");
        exibirFila(fila);
    }
}
