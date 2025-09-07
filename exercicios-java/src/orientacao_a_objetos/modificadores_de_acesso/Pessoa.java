package orientacao_a_objetos.modificadores_de_acesso;

public class Pessoa {
    // private: acessível apenas dentro da própria classe
    private String cpf;
    // public: acessível de qualquer lugar
    public String nome;
    // protected: acessível dentro do mesmo pacote e por subclasses
    protected int idade;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}
