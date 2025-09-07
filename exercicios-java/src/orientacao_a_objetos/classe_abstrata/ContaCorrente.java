package orientacao_a_objetos.classe_abstrata;

public class ContaCorrente extends Conta {
    // Implementação dos métodos abstratos da classe Conta. Exemplo de sobrescrita de métodos.
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

}
