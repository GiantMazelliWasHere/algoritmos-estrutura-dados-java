import java.util.ArrayList;

public class Ex01_Un02 {

    public static void invertArray(ArrayList<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
            right--;
        }
    }

    public static void printArray(String texto, ArrayList<Integer> arr) {
        System.out.print(texto);
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(64);
        arr.add(25);
        arr.add(12);
        arr.add(22);
        arr.add(11);
        arr.add(99);
        arr.add(88);
        arr.add(77);
        arr.add(66);
        arr.add(55);

        printArray("Array original: ", arr);
        invertArray(arr);
        printArray("Array invertido: ", arr);
        
    }
    
}
