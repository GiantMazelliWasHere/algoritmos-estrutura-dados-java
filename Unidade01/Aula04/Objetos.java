public class Objetos {
    //Atributos
    private String nome;
    private int idade;
    private float peso;

    //construtor
    public Objetos(String nome, int idade, float peso){
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
    public static void main(String[] args){
        Objetos pessoa = new Objetos("Eduardo", 26, 132.5f);
        Objetos pessoa2 = new Objetos("Leonardo", 27, 70.8f);

        pessoa.exibirInfos();
        pessoa2.exibirInfos();
    }
}
