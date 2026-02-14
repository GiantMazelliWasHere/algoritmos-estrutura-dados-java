public class Ex10_Un02 {
    public static void mergeSort(int[] arr) {
        int tamanho = arr.length;

        if(tamanho < 2){
            return;
        }

        int meio = tamanho / 2;
        int[] left = new int[meio];
        int[] right = new int[tamanho - meio];

        System.arraycopy(arr, 0, left, 0, meio);
        System.arraycopy(arr, meio, right, 0, tamanho - meio);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);

    }

    public static void merge(int[] left, int[] right, int[] arr){
        int tamanhoLeft = left.length;
        int tamanhoRight = right.length;
        int i = 0, j = 0, k = 0;

        while(i < tamanhoLeft && j < tamanhoRight){
            if(left[i] >= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while(i < tamanhoLeft){
            arr[k++] = left[i++];
        }

        while(j < tamanhoRight){
            arr[k++] = right[j++];
        }

    }

    public static void printArray(String texto, int[] arr) {
        System.out.println(texto);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {82, 14, 56, 3, 91, 27, 45, 68, 12, 99, 34, 76, 5, 50, 22, 88, 19, 61, 43, 7, 95, 31, 58, 10, 72};

        printArray("Array original:", arr);

        mergeSort(arr);

        printArray("Array ordenado em ordem decrescente:", arr);
    }
}
