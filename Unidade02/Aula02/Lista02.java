import java.util.ArrayList;

public class Lista02 {
    public static void main(String[] args) {
        ArrayList<String> listaCompraUpgrade = new ArrayList<>();

        //adicionando itens à lista dinamica
        listaCompraUpgrade.add("Queijo");
        listaCompraUpgrade.add("Presunto");
        listaCompraUpgrade.add("Pao");
        listaCompraUpgrade.add("Tomate");
        listaCompraUpgrade.add("Alface");

        ArrayList<String> ListaLanche = (ArrayList<String>) listaCompraUpgrade.clone();

        ListaLanche.add("Maionese");
        System.out.println(ListaLanche);

        System.out.println(listaCompraUpgrade.size());
        System.out.println(listaCompraUpgrade.isEmpty());
        listaCompraUpgrade.clear();
        System.out.println(listaCompraUpgrade.size());
        System.out.println(listaCompraUpgrade.isEmpty());

        //for (String item : ListaLanche) {
        //    System.out.println(item);
        //    if(item == "Feijao"){
        //        System.out.println("Feijao encontrado");
        //    }else{
        //        System.out.println("Feijao nao encontrado");
        //    }
        //}

        boolean existe = false;
        for (String item : ListaLanche) {
            System.out.println(item);
            if(item == "Feijao"){
                existe = true;
            }
        }

        if(existe){
            System.out.println("Item encontrado");
        }else{
            System.out.println("Item nao encontrado");
        }
        
    }

}
