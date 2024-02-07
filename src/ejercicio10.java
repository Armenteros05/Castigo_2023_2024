import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Llamar a la función para crear y rellenar la matriz cuadrada simétrica
        int[][] matrizSimetrica = crearMatrizSimetrica(dimension);

        // Imprimir la matriz por pantalla
        System.out.println("Matriz cuadrada simétrica generada:");
        imprimirMatriz(matrizSimetrica);

        scanner.close();
    }

    // Función para crear y rellenar una matriz cuadrada simétrica con números aleatorios
    public static int[][] crearMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = random.nextInt(100); // Generar un número aleatorio entre 0 y 99
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio; // Asignar el mismo número en la posición simétrica
            }
        }

        return matriz;
    }

    // Función para imprimir una matriz por pantalla
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
