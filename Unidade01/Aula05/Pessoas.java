import java.util.Scanner;

public class Pessoas {
    //Atributos
    private String nome;
    private int idade;
    private float peso;

    //construtor
    public Pessoas(String nome, int idade, float peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //metodos
    public void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
    }

    public void fazerAniversario(){
        this.idade = this.idade + 1;
        //this.idade += 1;
    }

    // gets e sets
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public static void main(String[] artgs){
        Scanner scanner = new Scanner(System.in);


        Pessoas pessoa = new Pessoas("Eduardo", 26, 132.5f);
        pessoa.exibirInfos();
        pessoa.fazerAniversario();
        pessoa.exibirInfos();

        pessoa.setNome("Eduardo Mazelli");
        pessoa.exibirInfos();

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade:");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite seu peso:");
        float peso = Float.parseFloat(scanner.nextLine());
        scanner.close();

        Pessoas pessoa2= new Pessoas(nome, idade, peso);
        pessoa2.exibirInfos();
    }
    
}
