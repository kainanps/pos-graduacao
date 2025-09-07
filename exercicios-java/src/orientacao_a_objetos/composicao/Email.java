package orientacao_a_objetos.composicao;

public class Email {
    public String endereco;

    public Email() {
        this.endereco = "";
    }

    public Email(String endereco) {
        this.endereco = endereco;
    }

    public boolean validarEmail() {
        return endereco.contains("@") && endereco.contains(".");
    }
}
    