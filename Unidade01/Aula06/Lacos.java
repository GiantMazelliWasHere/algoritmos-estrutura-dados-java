public class Lacos {
    public static void main(String[] args){
        // Laço de repetição for, repede um bloco de código um número específico de vezes
        for (int i = 0; i <= 10; i+=2){
            System.out.println("Valor de i: " + i);
        } 

        // laço while, repete N vezes um bloco de código enquanto uma condição não for verdadeira
        int x = 0;
        while (x <= 5){
            System.out.println("Valor de x: " + x);
            x++;
        }

        // laço Do while, repete N vezes um bloco de código enquanto uma condição não for verdadeira, mas garante que o bloco de código seja executado pelo menos uma vez
        int j = 0;
        do{
            System.out.println("Valor de j: " + j);
            j++;
        }while(j<=5);
    }
    
}
