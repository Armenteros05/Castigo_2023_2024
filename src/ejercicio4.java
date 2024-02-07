import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una lista de números enteros positivos (introduce un número negativo para finalizar):");

        int numero;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        do {
            numero = scanner.nextInt();

            // Verificar si el número es positivo
            if (numero >= 0) {
                // Actualizar el mínimo y el máximo
                minimo = Math.min(minimo, numero);
                maximo = Math.max(maximo, numero);
            }
        } while (numero >= 0);

        if (minimo == Integer.MAX_VALUE || maximo == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("El mínimo es: " + minimo);
            System.out.println("El máximo es: " + maximo);
        }

        scanner.close();
    }
}
