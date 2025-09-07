package orientacao_a_objetos.interfaces;

// Interface: contrato que define métodos que uma classe deve implementar, neste exemplo a subclasse Poupanca implementa a interface Conta e deve definir os métodos depositar, sacar e getSaldo
public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
