package orientacao_a_objetos.modificadores_de_acesso;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.cpf = "123.456.789-00"; // Erro: cpf é private
        pessoa.setCpf("123.456.789-00");
        pessoa.nome = "João"; // nome é public
        pessoa.idade = 30; // idade é protected (acessível dentro do mesmo pacote)

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());

        pessoa.exibirInfo();
    }
}
