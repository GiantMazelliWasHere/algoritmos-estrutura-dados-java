import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        String[] listaCompras = new String[3];
        listaCompras[0] = "Leite";
        listaCompras[1] = "Pão";
        listaCompras[2] = "Ovos";

        ArrayList<String> listaCompraUpgrade = new ArrayList<>();

        //adicionando itens à lista dinamica
        listaCompraUpgrade.add("Leite");
        listaCompraUpgrade.add("Pão");
        listaCompraUpgrade.add("Ovos");

        //vizualizando os itens
        System.out.println(listaCompras[2]);
        System.out.println(listaCompraUpgrade.get(0));

        //conta quantidade de itens
        System.out.println(listaCompras.length);
        System.out.println(listaCompraUpgrade.size());

        //busca na lista pelo item passado true ou false
        System.out.println(listaCompraUpgrade.contains("Leite"));

        //removendo itens da lista dinamica
        listaCompraUpgrade.remove("Leite");
        listaCompraUpgrade.remove(0);

        //limpando a lista dinamica, deixando ela vazia
        listaCompraUpgrade.clear();
    }
    
}
