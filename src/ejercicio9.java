import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de los vectores
        System.out.print("Ingrese la longitud de los vectores: ");
        int longitud = scanner.nextInt();

        // Crear los vectores y solicitar al usuario los elementos de cada vector
        int[] vector1 = leerVector(scanner, longitud);
        int[] vector2 = leerVector(scanner, longitud);

        // Calcular el producto escalar de los dos vectores
        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        // Imprimir el resultado
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    // Función para leer un vector de tamaño especificado desde el teclado
    public static int[] leerVector(Scanner scanner, int longitud) {
        int[] vector = new int[longitud];
        System.out.println("Ingrese los elementos del vector separados por espacio:");
        for (int i = 0; i < longitud; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud");
        }
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}
