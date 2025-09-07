package orientacao_a_objetos.excessao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            System.out.println("Você digitou: " + numero);
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
        } finally {
            scanner.close();
        }
    }
}
