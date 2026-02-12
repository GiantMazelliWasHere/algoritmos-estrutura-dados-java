import java.util.Scanner;

public class Ex08 {
    static int[] numeros = new int[10];
    
    public static void main(String[] args) {

        solicitarNumero(numeros);
        calcMaiorFrequencia(numeros);
    }

    public static void solicitarNumero(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um numero:");
            numeros[i] = sc.nextInt();
        }
    }

    public static void calcMaiorFrequencia(int[] numeros){
        int maiorFrequencia = 0;
        int numeroMaisFrequente = 0;

        for(int i = 0; i < numeros.length; i++){
            int frequencia = 0;
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    frequencia++;
                }
            }
            if(frequencia > maiorFrequencia){
                maiorFrequencia = frequencia;
                numeroMaisFrequente = numeros[i];
            }
        }

        System.out.println("O numero mais frequente é: " + numeroMaisFrequente);
    }
}
