package orientacao_a_objetos.composicao;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.nome = "João";
        usuario.senha = "123456";
        usuario.email.endereco = "joao@example.com";

        if (usuario.email.validarEmail()) {
            System.out.println("Email válido!");
        } else {
            System.out.println("Email inválido!");
        }

        System.out.println("Nome: " + usuario.nome);
        System.out.println("Senha: " + usuario.senha);
        System.out.println("Email: " + usuario.email.endereco);
    }
}
