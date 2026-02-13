import java.util.LinkedList;
import java.util.Queue;

public class Pedido {
    private int nPedido;
    private String[] itens;
    private float preco;

    public Pedido(int nPedido, String[] itens, float preco) {
        this.nPedido = nPedido;
        this.itens = itens;
        this.preco = preco;
    }
    public static void main(String[] args) {
        Queue<Pedido> fila = new LinkedList<>();

        String[] intensTempPedido1 = {"Burger","Refri","Batata"};
        Pedido pedido1 = new Pedido(123,intensTempPedido1,30.45f);

        String[] intensTempPedido2 = {"Pizza","Refri"};
        Pedido pedido2 = new Pedido(124,intensTempPedido2,25.00f);  

        String[] intensTempPedido3 = {"Sushi","Coca-cola"};
        Pedido pedido3 = new Pedido(125,intensTempPedido3,50.00f);


        fila.offer(pedido1);
        fila.offer(pedido2);
        fila.offer(pedido3);

        while(!fila.isEmpty()){
            Pedido pedidotemp = fila.poll();
            System.out.println("N do Pedido: " + pedidotemp.nPedido);
            System.out.println("Itens do Pedido: ");
            for(String item : pedidotemp.itens) {
                System.out.println("- " + item);
            }
            System.out.println("Preço do Pedido: " + pedidotemp.preco);
            System.out.println("-----------------------------");
        }
    }
    
}
