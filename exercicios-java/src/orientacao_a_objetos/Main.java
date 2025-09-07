package orientacao_a_objetos;

public class Main {
    public static void main(String[] args) {
        Cao meuCao = new Cao();
        // meuCao.nome = "Rex";
        // meuCao.idade = 5;

        meuCao.latir();
        meuCao.exibirInfo();

        Cao outroCao = new Cao("Buddy", 3);
        outroCao.latir();
        outroCao.exibirInfo();
    }
}
