import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public static void exibirInformacoes(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa[] listaDePessoas = null;
        int escolha;

        do {
            System.out.println("Menu: 1- Criar lista, 2- Alterar pessoa, 3- Exibir todos, 0- Sair");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                System.out.print("Quantas pessoas deseja cadastrar? ");
                int qtd = sc.nextInt();
                listaDePessoas = criarListaPessoas(qtd);

            } else if (escolha == 2) {
                if (listaDePessoas == null) {
                    System.out.println("Erro: Crie a lista primeiro!");
                    continue;
                }
                
                System.out.print("Digite o nome exato da pessoa que busca: ");
                String busca = sc.nextLine();
                boolean achou = false;

                for (Pessoa p : listaDePessoas) {
                    if (p.getNome().equalsIgnoreCase(busca)) {
                        menuAlteracao(p, sc);
                        achou = true;
                        break;
                    }
                }
                if (!achou) System.out.println("Pessoa não encontrada.");
            
            } else if (escolha == 3 && listaDePessoas != null) {
                for (Pessoa p : listaDePessoas) Pessoa.exibirInformacoes(p);
            }

        } while (escolha != 0);
        
        System.out.println("Programa encerrado.");
    }
            
    public static Pessoa[] criarListaPessoas(int quantidade) {
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro da pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Endereço: ");
            String endereco = sc.nextLine();
            pessoas[i] = new Pessoa(nome, idade, endereco);
        }
        return pessoas;
    }

    public static void menuAlteracao(Pessoa p, Scanner sc) {
        System.out.println("Alterando: " + p.getNome());
        System.out.print("O que mudar? (1-Nome, 2-Idade, 3-Endereço): ");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                System.out.print("Novo nome: ");
                p.setNome(sc.nextLine());
                break;
            case 2:
                System.out.print("Nova idade: ");
                p.setIdade(sc.nextInt());
                break;
            case 3:
                System.out.print("Novo endereço: ");
                p.setEndereco(sc.nextLine());
                break;
            default:
                System.out.println("Opção inválida.");
        }
        System.out.println("Dados atualizados!");
    }
}
