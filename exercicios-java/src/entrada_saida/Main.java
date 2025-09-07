package entrada_saida;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
            
        System.out.println("Digite seu nome:");

        String nome = entrada.next();

        System.out.println("Olá, " + nome + "!");
        System.out.print("Olá, " + nome + "!");
        System.out.printf("Olá, " + nome + "!");

    }    
}
