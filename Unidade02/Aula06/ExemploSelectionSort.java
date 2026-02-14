public class ExemploSelectionSort {

    public static void selectionSort(int[] arr) {
        int tamanho = arr.length;

        for(int i = 0; i < tamanho; i++){
            int minIndex = i;
            for(int j = i + 1; j < tamanho; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,34,121,45,67,89,12,9};

        System.out.println("Array original:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        selectionSort(arr);
        
        System.out.println("\nArray ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}