package estruturas_condicionais;

public class Main {
    public static void main(String[] args) {
        int numero = 15;

        // Estrutura if-else
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        // Estrutura if-else if-else
        if (numero > 0) {
            System.out.println(numero + " é um número positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é um número negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Estrutura switch-case
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Número inválido para dia da semana.";
                break;
        }

        System.out.println("O dia da semana é: " + nomeDia);
    }
}
