public class Condicionais {
    public static void main(String[] args){
        //== igual
        //!= diferente
        //> maior
        //< menor
        //>= maior ou igual
        //<= menor ou igual

        //&& operador lógico e
        //|| operador lógico ou
        //! operador lógico de negação

        //if sozinho
        int x = 5;
        if(x != 10){
            System.out.println("verdadeiro");
        }
        System.out.println("Fora do teste");

        //if com else
        int y = 1;
        if(y < 10){
            System.out.println("Verdade");
        }else{
            System.out.println("Falso");
        }

        // if encadeado
        int j = 100;
        if(j>50){
            System.out.println("primeiro if");
        } else if (j < 30){
            System.out.println("segundo if");
        } else{
            System.out.println("else");
        }

        //Switch case
        int opcao = 10;

        switch(opcao){
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            case 4:
                System.out.println("Opção 4");
                break;
            default:
                System.out.println("Opção inválida");
        }

        int b = 10;
        int c = 15;

        if(b == 10 && c==15){
            System.out.println("Ambas as condições são verdadeiras");
        } else if (b == 10 || c == 15){
            System.out.println("Pelo menos uma das condições é verdadeira");
        } else{
            System.out.println("Nenhuma das condições é verdadeira");
        }   
    }
}
