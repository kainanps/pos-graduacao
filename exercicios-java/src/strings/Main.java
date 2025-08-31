package strings;

public class Main {
    public static void main(String[] args) {
        String nome = "João Ferreira ";
        String sobrenome = "Silva";

        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Nome completo: " + nome.concat(sobrenome));
        System.out.println("comparando nomes: " + nome.equals(sobrenome));
        System.out.println("Extraindo parte do nome: " + nome.substring(0, 4));     
        System.out.println("Verificando se o nome contém a letra 'J': " + nome.contains("J"));
        System.out.println("Substituindo parte do nome: " + nome.replace("João", "Maria"));
    }
}
