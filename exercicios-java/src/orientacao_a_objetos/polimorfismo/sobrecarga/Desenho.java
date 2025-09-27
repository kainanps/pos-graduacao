package orientacao_a_objetos.polimorfismo.sobrecarga;

public class Desenho {

    public void desenhar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    // Sobrecarga do método desenhar
    // Na sobrecarga, o método tem o mesmo nome, mas parâmetros diferentes (tipo ou quantidade), ou seja, a assinatura é diferente
    public void desenhar(char simbolo) {
        for (int i = 0; i < 10; i++) {
            System.out.println(simbolo);
        }
    }

    public void desenhar(char simbolo, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(simbolo);
        }
    }

}