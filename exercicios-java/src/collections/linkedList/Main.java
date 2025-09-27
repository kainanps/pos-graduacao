package collections.linkedList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Exemplo simples de uso de LinkedList, que implementa a interface List.
        // LinkedList é uma coleção que armazena elementos em uma estrutura de lista duplamente ligada.
        // É muito útil quando precisamos de uma coleção que permita inserções e remoções rápidas em qualquer posição da lista.
        // Internamente, o LinkedList utiliza nós que contêm referências para o próximo e o anterior elemento, o que permite uma navegação eficiente pela lista.
        /* Principais características do LinkedList:
         * - Permite inserções e remoções rápidas em qualquer posição da lista.
         * - Ocupa mais memória do que um ArrayList devido aos nós adicionais.
         * - Acesso a elementos é mais lento do que em um ArrayList, pois é necessário percorrer a lista.
         * - Implementa as interfaces List, Deque e Queue, o que permite seu uso como lista, fila ou deque (fila dupla).
         */
        LinkedList<String> nomes = new LinkedList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        System.out.println(nomes);

        // Adicionando um elemento no início da lista
        nomes.addFirst("Daniela");
        System.out.println(nomes);

        // Adicionando um elemento no final da lista
        nomes.addLast("Eduardo");
        System.out.println(nomes);

        // Removendo o primeiro elemento da lista
        nomes.removeFirst();
        System.out.println(nomes);

        // Removendo o último elemento da lista
        nomes.removeLast();
        System.out.println(nomes);

        // Acessando o primeiro elemento da lista
        String primeiroNome = nomes.getFirst();
        System.out.println("Primeiro nome: " + primeiroNome);

        // Acessando o último elemento da lista
        String ultimoNome = nomes.getLast();
        System.out.println("Último nome: " + ultimoNome);

        // Adicionando um elemento em uma posição específica
        nomes.add(1, "Beatriz");
        System.out.println(nomes);
    }
}
