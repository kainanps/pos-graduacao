package vetor_java;

public class Main {
    public static void main(String[] args) {
        // int[] numeros = new int[5];
        // numeros[0] = 10;
        // numeros[1] = 20;
        // numeros[2] = 30;
        // numeros[3] = 40;
        // numeros[4] = 50;

        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número na posição " + i + ": " + numeros[i]);
        }
    }
}
