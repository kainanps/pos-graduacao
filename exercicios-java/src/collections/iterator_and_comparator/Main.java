package collections.iterator_and_comparator;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Exemplo simples de uso de ArrayList, que implementa a interface List.
        // ArrayList é uma coleção que armazena elementos de forma dinâmica.
        // Internamente, o ArrayList utiliza um array redimensionável para armazenar os elementos.
        // é muito útil quando precisamos de uma coleção que possa crescer ou diminuir de tamanho conforme necessário.
        // Principais características do ArrayList:
        // - Permite acesso rápido a elementos por índice.
        // - Cresce automaticamente quando novos elementos são adicionados.
        // - Ocupa menos memória do que um LinkedList para listas grandes.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        System.out.println(numeros);

        // Usando Iterator para percorrer a coleção
        // O Iterator permite percorrer a coleção de forma segura, mesmo que elementos sejam removidos durante a iteração.
        Iterator<Integer> iterator = numeros.iterator();
        // Enquanto houver próximo elemento
        // O método hasNext() verifica se há um próximo elemento na iteração.
        while (iterator.hasNext()) {
            // O método next() retorna o próximo elemento na iteração.
            Integer numero = iterator.next();
            System.out.println("Número: " + numero);
        }

        // Outra forma de usar o Iterator com forEachRemaining (Java 8+)
        // O método forEachRemaining() permite aplicar uma ação a todos os elementos restantes da iteração.
        // Neste caso, estamos apenas imprimindo os números restantes.
        iterator.forEachRemaining((value) -> System.out.println("Número: " + value));


    }
}
