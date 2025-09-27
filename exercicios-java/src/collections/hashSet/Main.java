package collections.hashSet;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Exemplo simples de uso de HashSet, que implementa a interface Set.
        // HashSet é uma coleção que armazena elementos únicos, ou seja, não permite elementos duplicados.
        // É muito útil quando precisamos garantir que uma coleção não tenha elementos repetidos.
        // Internamente, o HashSet utiliza uma tabela hash para armazenar os elementos, o que garante que as operações de inserção, remoção e busca sejam realizadas em tempo constante (O(1)).
        /* Principais características do HashSet:
         * - Armazena elementos únicos, não permitindo duplicatas.
         * - Não mantém a ordem dos elementos.
         * - Permite um único elemento nulo (null).
         * - Implementa a interface Set, que não permite elementos duplicados.
         * - Não é sincronizado, ou seja, não é thread-safe. Se for necessário o uso em ambientes multithread, deve-se usar Collections.synchronizedSet(new HashSet<>()).
         */
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        System.out.println(nomes);

        // Tentando adicionar um elemento duplicado
        boolean adicionado = nomes.add("Ana");
        System.out.println("Elemento 'Ana' adicionado novamente? " + adicionado);
        System.out.println(nomes);

        // Removendo um elemento
        nomes.remove("Bruno");
        System.out.println(nomes);

        // Verificando se um elemento existe
        boolean existe = nomes.contains("Carlos");
        System.out.println("Elemento 'Carlos' existe? " + existe);

        // Usando Iterator para percorrer a coleção
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println("Nome: " + nome);
        }
    }
}
