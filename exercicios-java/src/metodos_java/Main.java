package metodos_java;
import java.util.Scanner;

public class Main {

    public static int somar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args){
        System.out.print("digite o valor de a:");
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.print("digite o valor de b:");
        int b = new java.util.Scanner(System.in).nextInt();
        
        int resultado = somar(a, b);
        System.out.println("A soma é: " + resultado);
    }
}
