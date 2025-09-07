package orientacao_a_objetos.classe_abstrata;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());

        Conta contaPoupanca = new ContaPoupanca();
        
        contaPoupanca.depositar(500);
        contaPoupanca.sacar(100);
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
