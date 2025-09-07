package orientacao_a_objetos.interfaces;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Poupanca(3.0);
        
        minhaConta.depositar(1000);
        minhaConta.sacar(200);
        System.out.println("Saldo atual: " + minhaConta.getSaldo());
    }
}
