package orientacao_a_objetos.polimorfismo.sobrescrita;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        meuAnimal.fazerSom(); // Saída: O animal está fazendo um som

        Animal meuGato = new Gato();
        meuGato.fazerSom(); // Saída: O gato está miando
    }
}
