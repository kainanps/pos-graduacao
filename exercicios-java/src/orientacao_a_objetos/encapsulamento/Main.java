package orientacao_a_objetos.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 20, "2023001");
        aluno.exibirInfo();

        aluno.setIdade(21);
        aluno.setNome("Ana");
        aluno.setMatricula("2023002");
        aluno.exibirInfo();
    }
}
