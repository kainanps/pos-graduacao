package orientacao_a_objetos.composicao;

public class Usuario {
    public String nome;
    public String senha;
    public Email email; // Composição: Usuario "tem um" Email

    public Usuario() {
        this.email = new Email();// Inicializa o objeto Email
    }


}
