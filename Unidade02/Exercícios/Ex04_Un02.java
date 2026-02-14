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
                if ((topo != '(' && c == ')')){ 
                    return false;
                }
            }
        }
        
        if (!pilha.isEmpty()){
            System.out.println("Expressao esta desbalanceada.");
        } else {
            System.out.println("Expressao esta balanceada.");
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String expressao = "((a + b) * (c - d))";
        estaBalanceada(expressao);        
    }
}
