package orientacao_a_objetos.polimorfismo.sobrescrita;

public class Gato extends Animal {
    // Sobrescrita do método fazerSom()
    // Na sobrescrita, o método na classe filha (Gato) tem a mesma assinatura (nome e parâmetros) que o método na classe pai (Animal)
    @Override
    public void fazerSom() {
        System.out.println("O gato está miando");
    }

}
