public class ExemploInsertionSort {
    public class InsertionSort{
        public static void insertionSort(int[] arr) {
            int tamanho = arr.length;

            for(int i = 1; i < tamanho; i++){
                int temp = arr[i];
                int j = i - 1;

                while(j >= 0 && arr[j] > temp){
                    arr[j + 1] = arr[j];
                    j--;
                }

                arr[j+1] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {23,34,121,45,67,89,12,9};

            System.out.println("Array original:");
            for (int i : arr) {
                System.out.print(i + " ");
            }

            insertionSort(arr);

            System.out.println("\nArray ordenado:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
