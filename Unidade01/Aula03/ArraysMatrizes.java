package Unidade01.Aula03;

import java.util.Scanner;

public class ArraysMatrizes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Arrays
        int[] numeros = {1,2,3};
        int[] numeros2 = new int[5];

        numeros2[0] = 10;
        numeros2[1] = 20;
        numeros2[2] = 30;
        numeros2[3] = 40;
        numeros2[4] = 50;

        System.out.println(numeros[0]);
        System.out.println(numeros2[4]);

        //Matriz
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}}; // int [linha][coluna]
        int[][] matriz2 = new int[3][3];
        System.out.println(matriz[2][2]);
        System.out.println(matriz2[1][2]);

        System.out.print("Digite um número:");
        numeros[0] = Integer.parseInt(sc.nextLine());
        System.out.println("O número digitado foi: " + numeros[0]);

    }
    
}
