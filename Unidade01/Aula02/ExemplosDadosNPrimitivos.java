package Unidade01.Aula02;

public class ExemplosDadosNPrimitivos {
    public static void main(String[] args) {
        //tipo caracter PRIMITIVO
        char letra = 'A';

        // tipo caracter NÃO PRIMITIVO
        String nome = "Eduardo";
        nome  ="Eduardo Mazelli";

        // tipe Enum
        enum DiaDaSemana{
            Domingo, Segunda, Terça, Quarta, Quinta, Sexta, Sábado
        }

        DiaDaSemana dia = DiaDaSemana.Quarta;

        // tipo array
        int[] numeros = {1,2,3,4,5}; // começa sempre em 0

        // imprimindo os valores
        System.out.println(nome);
        System.out.println(dia);
        System.out.println(numeros[0]);
    }
    
}
