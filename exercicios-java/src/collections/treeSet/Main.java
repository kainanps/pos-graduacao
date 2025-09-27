package collections.treeSet;
import java.util.TreeSet;

public interface Main {
    public static void main(String[] args) {
        // Exemplo simples de uso de TreeSet, que implementa a interface Set.
        // TreeSet é uma coleção que armazena elementos únicos em ordem crescente.
        // É muito útil quando precisamos de uma coleção ordenada sem elementos duplicados.
        // Internamente, o TreeSet utiliza uma árvore rubro-negra para armazenar os elementos. Rubro-negra é uma árvore binária de busca auto-balanceada, o que garante que as operações de inserção, remoção e busca sejam realizadas em tempo logarítmico (O(log n)).
        /* Principais características do TreeSet:
         * - Armazena elementos únicos em ordem crescente.
         * - Não permite elementos duplicados.
         * - Implementa a interface NavigableSet, que fornece métodos adicionais para navegação na coleção.
         * - Permite operações de intervalo, como subSet, headSet e tailSet.
         * - Acessa o menor e o maior elemento com os métodos first() e last().
         */
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        System.out.println(numeros);

        // Tentando adicionar um elemento duplicado
        boolean adicionado = numeros.add(10);
        System.out.println("Elemento '10' adicionado novamente? " + adicionado);
        System.out.println(numeros);

        // Removendo um elemento
        numeros.remove(5);
        System.out.println(numeros);

        // Verificando se um elemento existe
        boolean existe = numeros.contains(15);
        System.out.println("Elemento '15' existe? " + existe);

        // Acessando o menor elemento
        Integer menor = numeros.first();
        System.out.println("Menor elemento: " + menor);

        // Acessando o maior elemento
        Integer maior = numeros.last();
        System.out.println("Maior elemento: " + maior);


        // adcionando mais elementos de forma desordenada
        numeros.add(7);
        numeros.add(3);
        numeros.add(12);
        System.out.println(numeros); // Note que os elementos são armazenados em ordem crescente
    }
}
