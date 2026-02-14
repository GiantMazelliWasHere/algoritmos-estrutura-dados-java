import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Ex05_Un02 {

    public static void inversaoPilha(ArrayList<Integer> arr) {
        Deque<Integer> pilha = new ArrayDeque<>();
        for (Integer num : arr) {
            pilha.push(num);
        }
        
        arr.clear();
        
        while (!pilha.isEmpty()) {
            arr.add(pilha.pop());
        }
    }

    public static void printArray(String texto, ArrayList<Integer> array) {
        System.out.println(texto);
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        printArray("Array original: ", array);
        inversaoPilha(array);
        printArray("Array invertido: ", array);
    }
    
}
