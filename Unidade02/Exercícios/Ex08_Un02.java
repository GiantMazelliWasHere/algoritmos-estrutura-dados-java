import java.util.HashMap;
import java.util.Map;

public class Ex08_Un02 {

    public static void main(String[] args) {
        String texto = "Exemplo de texto para contar a frequência de palavras. Este texto inclui palavras repetidas, como exemplo, texto e palavras.";

        String[] palavras = texto.toLowerCase().replaceAll("[^a-zA-Záàâãéèêíïóôõöúç ]", "").split("\\s+");

        Map<String, Integer> frequencia = new HashMap<>();
        
        for(String palavra: palavras){
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : frequencia.entrySet()){
            System.out.println("Palavra: " + entry.getKey() + " - Frequência: " + entry.getValue());
        }
    }
    
}    
    
