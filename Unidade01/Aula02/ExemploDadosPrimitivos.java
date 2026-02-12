public class ExemploDadosPrimitivos{
    public static void main(String[] args){
        // numericos inteiros
        byte valorByte = 127; // -128 a 127
        short valorShort = 32767; // -32768 a 32767
        int valorInt = 2147483647; // -2147483648 a 2147483647
        long valorLong = 9223372036854775807L; // -9223372036854775808L a 9223372036854775807L

        // numericos reais
        float valorFloat = 3.14f;
        double valorDouble = 3.14159265359;

        // tipos caracter
        char valorChar = 'A'; // caractere único, sempre entre aspas simples

        // tipo booleano
        boolean verdadeiro = true;
        boolean falso = false;

        //numero pi, constante
        final float nPi = 3.1415f;


        // imprimindo os valores
        System.out.println("Valor byte: " + valorByte);
        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor long: " + valorLong);
        System.out.println("Valor float: " + valorFloat);
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor char: " + valorChar);
        System.out.println("Valor boolean verdadeiro: " + verdadeiro);
        System.out.println("Valor boolean falso: " + falso);
        System.out.println("Valor constante nPi: " + nPi);
    }
}