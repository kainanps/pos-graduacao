package operadores_logicos;

public class Main {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 10;

        // operador >
        if (num1 > num2) {
            System.out.println("O número 1 é maior que o número 2.");
        } else {
            System.out.println("O número 1 não é maior que o número 2.");
        }

        // operador <
        if (num1 < num2) {
            System.out.println("O número 1 é menor que o número 2.");
        } else {
            System.out.println("O número 1 não é menor que o número 2.");
        }

        // operador ==
        if (num1 == num2) {
            System.out.println("O número 1 é igual ao número 2.");
        } else {
            System.out.println("O número 1 não é igual ao número 2.");
        }

        // operador !=
        if (num1 != num2) {
            System.out.println("O número 1 é diferente do número 2.");
        } else {
            System.out.println("O número 1 não é diferente do número 2.");
        }

        // operador >=
        if (num1 >= num2) {
            System.out.println("O número 1 é maior ou igual ao número 2.");
        } else {
            System.out.println("O número 1 não é maior ou igual ao número 2.");
        }

        // operador <=
        if (num1 <= num2) {  
            System.out.println("O número 1 é menor ou igual ao número 2.");
        } else {
            System.out.println("O número 1 não é menor ou igual ao número 2.");
        }

        // Operador AND (&&)
        if (num1 > 20 && num2 < 15) {
            System.out.println("Ambas as condições são verdadeiras.");
        } else {
            System.out.println("Pelo menos uma das condições é falsa.");
        }

        // Operador OR (||)
        if (num1 > 30 || num2 < 15) {   
            System.out.println("Pelo menos uma das condições é verdadeira.");
        } else {
            System.out.println("Ambas as condições são falsas.");
        }

        // Operador NOT (!)
        boolean condicao = true;
        if (!condicao) {
            System.out.println("A condição é falsa.");
        } else {
            System.out.println("A condição é verdadeira.");
        }

    }
}
