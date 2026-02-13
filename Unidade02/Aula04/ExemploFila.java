import java.util.LinkedList;
import java.util.Queue;

class ExemploFila {
    public static void main(String[] args) {
        //FIFO - First In First Out
        Queue<String> fila = new LinkedList<>();

        //Adiciona elementos na fila
        fila.offer("1 fila");
        fila.offer("2 fila");
        fila.offer("3 fila");

        //Exibe o primeiro elemento da fila
        System.out.println(fila.peek());

        //Remove o primeiro elemento da fila e exibe, se estiver vazia retorna null 
        System.out.println(fila.poll());

        while(!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}