import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploPilha {
    public static void main(String[] args) {
        //LIFO - Last In First Out
        Deque<Integer> pilha = new ArrayDeque<>();

        //Adicionar elementos na pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.println(pilha);

        //Acessar o topo da pilha, sem remover
        System.out.println(pilha.peek());

        //Acessar o topo da pilha, removendo
        System.out.println(pilha.pop());
        System.out.println(pilha);

        //Desempilhar todos os elementos, item por item
        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }

    }
    
}
