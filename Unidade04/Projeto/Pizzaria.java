package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Projeto.Pizza.TamanhoPizza;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> listaClientes = new ArrayList<>();
        List<Pedido> listaPedidos = new ArrayList<>();


        boolean continuar = true;
        while(continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Fazer pedido");
            System.out.println("2. Alterar pedido");
            System.out.println("3. Adicionar cliente");
            System.out.println("4. Gerar relatório de vendas");
            System.out.println("5. Gerar lista de clientes");
            System.out.println("9. Sair");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch(opcao){
                case 1:
                    fazerPedido(scanner, listaPedidos, listaClientes);
                    break;
                case 2:
                    alterarPedido();
                    break;
                case 3:
                    listaClientes.add(adicionarCliente(scanner));
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 4:
                    gerarRelatorioVendas();
                    break;
                case 5:
                    gerarListaClientes(listaClientes);
                    break;
                case 9:
                    continuar = false;
                    System.out.println("Saindo do sistema. Obrigado por usar a Pizzaria!");
                    scanner.close();
                    break;
                default:
                    break;
            }
            
        }
        
    }
    
    private static void fazerPedido(Scanner scanner, List<Pedido> listaPedidos, List<Cliente> listaClientes) {
        List<Pizza> pizzas = new ArrayList<>();
        System.out.println("FAZER PEDIDO");

        int x =1;

        System.out.println("Selecione o cliente:");
        for (Cliente cliente : listaClientes) {
            System.out.println(x + ". " + cliente.getNome());
            x++;
        }
        System.out.print("Opção: ");
        int cliente = scanner.nextInt();
        scanner.nextLine();

        boolean contiuar = true;
        while (contiuar) {
            x = 1;
            System.out.println("Selecione o tamanho da pizza:");
            for (TamanhoPizza tamanhos : Pizza.TamanhoPizza.values()) {
                System.out.println(x + ". " + tamanhos);
                x++;
            }
            System.out.print("Opção: ");
            int tamanho = scanner.nextInt();
            scanner.nextLine();

            int quantiSabores = 0;
            while (quantiSabores < 1 || quantiSabores > 4) {
                System.out.println("Digite a quantidade de sabores (1 a 4): ");
                System.out.print("Opção: ");
                quantiSabores = scanner.nextInt();
                scanner.nextLine();
            }

            Cardapio cardapio = new Cardapio();
            List<String> saboresList = new ArrayList<>();
            List<String> saboresSelecionados = new ArrayList<>();

            for (int i = 0; i < quantiSabores; i++) {
                System.out.println("Selecione o sabor:");

                x = 1;
                for (String sabor : cardapio.getCardapio().keySet()) {
                    saboresList.add(sabor);
                    System.out.println(x + ". " + sabor);
                    x++;
                }
                System.out.print("Opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                saboresSelecionados.add(saboresList.get(opcao - 1));
            }

            Pizza pizza = new Pizza(saboresSelecionados, cardapio.getPrecoJusto(saboresSelecionados), TamanhoPizza.getByIndex(tamanho - 1));
            pizzas.add(pizza);

            System.out.println("Pizza adicionada ao pedido com sucesso!");
            System.out.println();
            System.out.println("Deseja adicionar mais pizzas ao pedido?");]
            System.out.print("1. Sim, 2. Não: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao != 1){
                contiuar = false;
            }
        }
        Pedido pedido = new Pedido (listaPedidos.size() + 1,listaClientes.get(cliente - 1), pizzas, somarPizzas(pizzas));
        listaPedidos.add(pedido);
    }

    private static double somarPizzas(List<Pizza> pizzas) {
        double valorTotal = 0.0;
        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }
        return valorTotal;
    }

    private static void alterarPedido() {
        System.out.println("Alterar pedido");
    }

    private static Cliente adicionarCliente(Scanner scanner) {
        System.out.println("ADICIONAR CLIENTE");
        System.out.println();
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();
        System.out.println();
        
        return new Cliente(nome, endereco, telefone, email);
    }

    private static void gerarRelatorioVendas() {
        System.out.println("Gerar relatório de vendas");
    }

    private static void gerarListaClientes(List<Cliente> listaClientes) {
        int x = 1;
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : listaClientes) {
                System.out.println("Cliente " + x);
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Endereço: " + cliente.getEndereco());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println();
                x++;
            }
        }
        
    }
}
