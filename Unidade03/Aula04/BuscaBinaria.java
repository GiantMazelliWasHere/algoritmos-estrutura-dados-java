package Unidade03.Aula04;

public class BuscaBinaria {

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
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int key = 20;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Elemento encontrado na posicao: " + result);
        } else {
            System.out.println("Elemento nao encontrado.");
        }
    }
}
