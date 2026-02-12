import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        
        System.out.print("Você deseja fazer? (1 - Adicionar número, 2 - Remover número, 0 - Sair): ");
        int opcao = Integer.parseInt(scanner.nextLine());

        while (opcao != 0) {
            if(opcao == 1) {
                System.out.print("Digite um número inteiro para adicionar: ");
                int numeroParaAdicionar = Integer.parseInt(scanner.nextLine());
                numeros.add(numeroParaAdicionar);
                System.out.println("Número adicionado: " + numeroParaAdicionar);
                System.out.println("Lista atual: " + numeros);
            } else if(opcao == 2) {
                System.out.print("Digite um número inteiro para remover: ");
                int numeroParaRemover = Integer.parseInt(scanner.nextLine());
                if(numeros.remove(Integer.valueOf(numeroParaRemover))) {
                    System.out.println("Número removido: " + numeroParaRemover);
                    System.out.println("Lista atual: " + numeros);
                } else {
                System.out.println("Número não encontrado na lista.");
                System.out.println("Lista atual: " + numeros);
                }
            } else {
                System.out.println("Opção inválida.");
            }
            System.out.println("Lista atual: " + numeros);

            System.out.print("Você deseja fazer? (1 - Adicionar número, 2 - Remover número, 0 - Sair): ");
            opcao = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Programa encerrado. Lista final: " + numeros);
        scanner.close();
    
    }
}
