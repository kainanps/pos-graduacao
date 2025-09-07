package orientacao_a_objetos.classe_abstrata;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca() {
        // Chama o construtor da classe base
        super();
        this.taxaJuros = 0.03; // 3% de juros
    }

    // Implementação dos métodos abstratos da classe Conta. Exemplo de sobrescrita de métodos.
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }

}
