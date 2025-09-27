package orientacao_a_objetos.polimorfismo.sobrecarga;

public class Main {

    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        desenho.desenhar();
        desenho.desenhar('#');
        desenho.desenhar('$', 5);
    }

}
