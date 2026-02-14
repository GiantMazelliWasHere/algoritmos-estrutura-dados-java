import java.util.ArrayList;

public class Ex02_Un02 {
    public static void removerDuplicados(ArrayList<Integer> array) {
        int n = array.size();
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array.get(i) != array.get(i + 1)) {
                temp[j++] = array.get(i);
            }
        }
        temp[j++] = array.get(n - 1);

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
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
