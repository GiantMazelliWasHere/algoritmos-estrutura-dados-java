import java.util.HashMap;
import java.util.Map;

public class ExemploMaps {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<>();

        //Adiciona no mapa a chave (k) e o valor (v)
        mapa.put("Eduardo", 30);
        mapa.put("Maria", 25);
        mapa.put("Joao", 35);
        mapa.put("Ana", 28);

        System.out.println(mapa);

        //Retorna o valor associado à chave passada como argumento
        System.out.println(mapa.get("Maria"));

        //Subistitui o valor da chave passada como argumento, se nao encontrar nada acontece
        mapa.replace("Joao", 18);
        System.out.println(mapa);

        //Adiciona o valor se a chave não existir
        mapa.putIfAbsent("Joana",100);
        System.out.println(mapa);

        //remove do mapa a chave passada como argumento
        mapa.remove("Ana");
        System.out.println(mapa);

        //Verifica se a chave passada como argumento existe no mapa
        if(mapa.containsKey("Jonas")){
            System.out.println("Existe a chave passada");
        } else {
            System.out.println("Nao existe a chave passada");
        }

        //Verifica se o valor passado como argumento existe no mapa
        if(mapa.containsValue(18)){
            System.out.println("Existe o valor passado");
        } else {
            System.out.println("Nao existe o valor passado");
        }

        //retorna true ou false em relacao ao mapa
        if(mapa.isEmpty()){
            System.out.println("O mapa esta vazio");
        } else {
            System.out.println("O mapa nao esta vazio");
        }

        //Laço para verificar todo o mapa
        for (String nome: mapa.keySet()) {
            System.out.println(nome);
        }

        //Exibe o tamanho do mapa
        int tamanho = mapa.size();
        System.out.println("O tamanho do mapa é: " + tamanho);
    }
}
