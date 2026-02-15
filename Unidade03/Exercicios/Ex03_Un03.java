public class Ex03_Un03 {
    static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4, 7, 9, 2, 6, 10};
        int key = 7;
        int key2 = 100;

        int result = linearSearch(arr, key);
        int result2 = linearSearch(arr, key2);
        
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
