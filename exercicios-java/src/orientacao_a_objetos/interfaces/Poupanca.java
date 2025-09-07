package orientacao_a_objetos.interfaces;

public class Poupanca implements Conta {
    private double saldo;
    private double taxaJuros;

    public Poupanca(double taxaJuros) {
        this.saldo = 0.0;
        this.taxaJuros = taxaJuros;
    }

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

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros / 100;
    }

}
