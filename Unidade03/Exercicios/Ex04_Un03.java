public class Ex04_Un03 {
    static int binarySearch(int[] arr, int key) {
        int inicio = 0;
        int fim = arr.length - 1;

        while(inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if(arr[meio] == key){
                return meio;
            }

            if(arr[meio] < key){
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int key = 25;
        int key2 = 100;

        int result = binarySearch(arr, key);
        int result2 = binarySearch(arr, key2);

        if (result != -1) {
            System.out.println("O numero pode ser encontrado na posicao: " + result);
        } else {
            System.out.println("O numero nao foi encontrado.");
        }

        if (result2 != -1) {
            System.out.println("O numero pode ser encontrado na posicao: " + result2);
        } else {
            System.out.println("O numero nao foi encontrado.");
        }
    }
}
