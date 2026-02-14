import java.util.ArrayDeque;
import java.util.Deque;

public class Ex04_Un02 {
    public static boolean estaBalanceada(String ex){
        Deque<Character> pilha = new ArrayDeque<>();

        for (int i = 0; i < ex.length(); i++){
            char c = ex.charAt(i);

            if(c == '('){
                pilha.push(c);
            } else if (c == ')'){
                if (pilha.isEmpty()){
                    return false;
                }
                char topo = pilha.pop();
                if ((c == ')' && topo != '(')){
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String expressao = "((a + b) * (c - d))";
        boolean resultado = estaBalanceada(expressao);
        System.out.println("A expressao esta balanceada? " + resultado);
    }
}
