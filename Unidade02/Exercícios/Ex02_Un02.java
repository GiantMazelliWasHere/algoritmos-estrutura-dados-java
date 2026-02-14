import java.util.ArrayList;

public class Ex02_Un02 {
    public static void removerDuplicados(ArrayList<Integer> array) {
        int n = array.size();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (array.get(i) != array.get(i + 1)) {
                temp.add(array.get(i));
            }
        }
        temp.add(array.get(n - 1));

        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i) + " ");
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
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(4);
        array.add(5);

        printArray("Array original: ", array);
        System.out.println("Array sem duplicados: ");
        removerDuplicados(array);
    }
}
