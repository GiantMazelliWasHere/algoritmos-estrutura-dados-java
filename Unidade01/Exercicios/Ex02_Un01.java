import java.util.Scanner;

public class Ex02_Un01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = Integer.parseInt(scanner.nextLine());

        if (numeroInteiro % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        scanner.close();
    }
    
}
