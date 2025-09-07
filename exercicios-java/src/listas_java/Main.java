package listas_java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Exibir itens da lista
        System.out.println("Itens na lista:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Remover um item
        lista.remove("Banana");
        System.out.println("\nApós remover Banana:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Tamanho da lista
        System.out.println("\nTamanho da lista: " + lista.size());

        // Verificar se a lista contém um item
        if (lista.contains("Maçã")) {
            System.out.println("A lista contém Maçã.");
        } else {
            System.out.println("A lista não contém Maçã.");
        }

        // Acessar um item pelo índice
        System.out.println("Item no índice 0: " + lista.get(0));


        // Adicionar um item em uma posição específica
        lista.add(1, "Uva");
        System.out.println("\nApós adicionar Uva na posição 1:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Adicionar um item no final da lista
        lista.add("Pera");
        System.out.println("\nApós adicionar Pera no final da lista:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Substituir um item em uma posição específica
        lista.set(0, "Manga");
        System.out.println("\nApós substituir o item na posição 0:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Verificar se a lista está vazia
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia.");
        }

        // Obter o índice de um item
        int index = lista.indexOf("Laranja");
        System.out.println("Índice de Laranja: " + index);


        // Remover um item por índice
        lista.remove(2);

        // Limpar a lista
        lista.clear();
        System.out.println("\nApós limpar a lista:");
        for (String item : lista) {
            System.out.println(item);
        }
    }
}
