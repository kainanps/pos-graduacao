package orientacao_a_objetos.classe_abstrata;

// Classe abstrata: não pode ser instanciada diretamente
public abstract class Conta {
    protected double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

}
