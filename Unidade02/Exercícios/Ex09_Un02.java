import java.util.HashMap;
import java.util.Map;

public class Ex09_Un02 {
    public static void main(String[] args) {
        Map<String, Integer> depositoJJ = new HashMap<>();
        depositoJJ.put("Coca-Cola", 10);
        depositoJJ.put("Pepsi", 5);
        depositoJJ.put("Fanta", 8);
        depositoJJ.put("Sprite", 12);
        depositoJJ.put("Guarana", 7);

        Map<String, Integer> depositoKK = new HashMap<>();
        depositoKK.put("Coca-Cola", 15);
        depositoKK.put("Pepsi", 10);
        depositoKK.put("Dr.Pepper", 5);
        depositoKK.put("Monster", 6);
        depositoKK.put("Sprite", 4);

        depositoKK.forEach((chave, valor) -> depositoJJ.merge(chave, valor, (valorAntigo, valorNovo) -> valorAntigo + valorNovo));

        System.out.println("Estoque atualizado:");
        depositoJJ.forEach((chave, valor) -> System.out.println(chave + ": " + valor));
    }
}
