package orientacao_a_objetos;

public class Cao {
    String nome;
    int idade;

    // Construtor padrão    
    public Cao() {
        this.nome = "Sem nome";
        this.idade = 0;
    }

    // sobrecarga de construtor
    public Cao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void latir() {
        System.out.println("Au Au!");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}
