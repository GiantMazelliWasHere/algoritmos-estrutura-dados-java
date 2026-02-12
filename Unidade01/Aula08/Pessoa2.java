public class Pessoa2 {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private boolean habilitada;

    public Pessoa2(String nome, int idade, float peso, float altura, boolean habilitada) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.habilitada = habilitada;
    }

    public void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public void testarAltura(float alturaMinima) {
        if (alturaMinima <= this.altura) {
            System.out.println(" Autorizada a entrada.");
        } else {
            System.out.println(" Não autorizada a entrada.");
        }
    }

    public void testarIdade(){
        if(this.idade >= 18){
            System.out.println("Maior de idade. Pode beber.");
        }else{
            System.out.println("Menor de idade. Não pode beber.");
        }
    }

    public float testeIMC(){
        float IMC = this.peso / (this.altura * this.altura);
        if(IMC < 18.5){
            System.out.println("Magreza");
        } else if(IMC >= 18.5 && IMC < 24.9){
            System.out.println("Normal");
        } else if(IMC >= 25 && IMC < 29.9){
            System.out.println("Sobrepeso");
        } else if(IMC >= 30 && IMC < 34.9){
            System.out.println("Obesidade I");
        } else if(IMC >= 35 && IMC < 39.9){
            System.out.println("Obesidade II");
        } else if (IMC >= 40){
            System.out.println("Obesidade III");
        };
        return IMC;
    }

    public void testeDeHabilicacao(){
        if(this.habilitada){
            System.out.println("Possui habilitação.");
        } else {
            System.out.println("Não possui habilitação.");
        }
    }

    public static void main(String[] args) {
        Pessoa2 pessoa = new Pessoa2("Eduardo", 26, 138.9f, 1.95f, false);
        pessoa.testarAltura(1.80f);
        pessoa.testarIdade();
        float imc = pessoa.testeIMC();
        System.out.println(imc);
        pessoa.testeDeHabilicacao();
    }
    
}
