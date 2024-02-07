import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Obtener los factores primos del número ingresado
        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        // Imprimir los factores primos del número ingresado
        System.out.print("Los factores primos de " + numero + " son: ");
        for (int i = 0; i < factoresPrimos.length; i++) {
            if (i != 0) {
                System.out.print(" * ");
            }
            System.out.print(factoresPrimos[i]);
        }

        scanner.close();
    }

    // Función para descomponer un número en factores primos
    public static int[] descomponerEnFactoresPrimos(int numero) {
        int[] factoresPrimos = new int[calcularNumeroFactoresPrimos(numero)];
        int indice = 0;

        // Descomponer el número en factores primos
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos[indice] = i;
                indice++;
                numero /= i;
            }
        }

        return factoresPrimos;
    }

    // Función para calcular el número de factores primos de un número
    public static int calcularNumeroFactoresPrimos(int numero) {
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                contador++;
                numero /= i;
            }
        }
        return contador;
    }
}
