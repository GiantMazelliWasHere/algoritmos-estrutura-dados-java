import java.util.ArrayList;

public class Ex03_Un02 {

    public static void mergeArrays(ArrayList<Integer> array1, ArrayList<Integer> array2, ArrayList<Integer> mergedArray) {
        int i = 0;
        int n1 = array1.size();
        int n2 = array2.size();

        while (i<n1 || i<n2) {
            if (i < n1) {
                mergedArray.add(array1.get(i));
            }
            if (i < n2) {
                mergedArray.add(array2.get(i));
            }
            i++;
        }
    }
    
    public static void printArray(String text,ArrayList<Integer> array) {
        System.out.println(text);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> mergedArray = new ArrayList<>();

        array1.add(1);
        array1.add(3);
        array1.add(5);
        array1.add(7);
        array1.add(9);

        array2.add(10);
        array2.add(4);
        array2.add(6);
        array2.add(8);
        array2.add(2);

        mergeArrays(array1, array2, mergedArray);
        printArray("Array 1: ", array1);
        printArray("Array 2: ", array2);
        printArray("Merged Array: ", mergedArray);
    }
    
}
