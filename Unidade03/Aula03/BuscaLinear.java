public class BuscaLinear {

    static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4, 7, 9, 2, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int key = 19;

        int result = linearSearch(arr, key);
        
        if (result != -1) {
            System.out.println("Elemento encontrado na posicao: " + result);
        } else {
            System.out.println("Elemento nao encontrado.");
        }
    }
}
