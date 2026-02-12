import java.util.Scanner;

class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public static void exibirInformacoes(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Preço: " + produto.getPreco());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Produto[] estoque = null;
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu: 1- Criar estoque, 2- Adicionar produto, 3- Remover produto, 4- Atualizar produto, 5- Exibir estoque, 0- Sair");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                System.out.print("Quantos produtos deseja cadastrar? ");
                int qtd = sc.nextInt();
                estoque = criarEstoque(qtd);

            } else if (escolha == 2) {
                if (estoque == null) {
                    System.out.println("Erro: Crie o estoque primeiro!");
                    continue;
                }
                System.out.print("Digite o nome do produto: ");
                String nome = sc.nextLine();
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = sc.nextInt();
                System.out.print("Digite o preço do produto: ");
                double preco = sc.nextDouble();
                sc.nextLine();
                adicionarProduto(estoque, nome, quantidade, preco);

            } else if (escolha == 3) {
                if (estoque == null) {
                    System.out.println("Erro: Crie o estoque primeiro!");
                    continue;
                }
                System.out.print("Digite o nome do produto a remover: ");
                String nome = sc.nextLine();
                removerProduto(estoque, nome);

            } else if (escolha == 4) {
                if (estoque == null) {
                    System.out.println("Erro: Crie o estoque primeiro!");
                    continue;
                }
                System.out.print("Digite o nome do produto a atualizar: ");
                String nome = sc.nextLine();
                new Ex10().atualizarProduto(estoque, nome);

            } else if (escolha == 5) {
                if (estoque == null) {
                    System.out.println("Erro: Crie o estoque primeiro!");
                    continue;
                }
                for (Produto p : estoque) {
                    if (p != null) {
                        Produto.exibirInformacoes(p);
                    }
                }
            }

        } while (escolha != 0);
    }

    public static Produto[] criarEstoque(int qtd) {
        Produto[] estoque = new Produto[qtd];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < estoque.length; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite a quantidade do produto: ");
            int quantidade = sc.nextInt();
            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            estoque[i] = new Produto(nome, quantidade, preco);
        }
        return estoque;
    }

    public static void adicionarProduto(Produto[] estoque, String nome, int quantidade, double preco) {
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] == null) {
                estoque[i] = new Produto(nome, quantidade, preco);
                System.out.println("Produto adicionado: " + nome);
                return;
            }
        }
        System.out.println("Estoque cheio. Não foi possível adicionar o produto: " + nome);
    }

    public static void removerProduto(Produto[] estoque, String nome) {
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] != null && estoque[i].getNome().equalsIgnoreCase(nome)) {
                estoque[i] = null;
                System.out.println("Produto removido: " + nome);
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nome);
    }

    public void atualizarProduto(Produto[] estoque, String nome) {
        Scanner sc = new Scanner(System.in);
        System.out.print("O que deseja atualizar? (1- Quantidade, 2- Preço): ");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.print("Digite a nova quantidade: ");
            int novaQuantidade = sc.nextInt();
            for (Produto p : estoque) {
                if (p != null && p.getNome().equalsIgnoreCase(nome)) {
                    p.setQuantidade(novaQuantidade);
                    System.out.println("Produto atualizado: " + nome);
                    return;
                }
            }
        } else if (escolha == 2) {
            System.out.print("Digite o novo preço: ");
            double novoPreco = sc.nextDouble();
            for (Produto p : estoque) {
                if (p != null && p.getNome().equalsIgnoreCase(nome)) {
                    p.setPreco(novoPreco);
                    System.out.println("Produto atualizado: " + nome);
                    return;
                }
            }
        } else {
            System.out.println("Opção inválida.");
        }
        
        System.out.println("Produto não encontrado: " + nome);
    }
    
}
