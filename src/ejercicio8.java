import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los números enteros hasta que se introduzca un 0
        int[] numeros = recibirNumeros(scanner);

        // Calcular la media, el mínimo y el máximo de los datos introducidos
        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        // Imprimir los resultados
        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        scanner.close();
    }

    // Función para recibir N números enteros por teclado hasta que se introduzca un 0
    public static int[] recibirNumeros(Scanner scanner) {
        System.out.println("Introduce números enteros (introduce 0 para terminar):");

        int capacidadInicial = 10;
        int[] numeros = new int[capacidadInicial];
        int cantidadNumeros = 0;
        int numero;

        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (cantidadNumeros == numeros.length) {
                // Aumentar la capacidad del array si es necesario
                numeros = aumentarCapacidad(numeros);
            }
            numeros[cantidadNumeros] = numero;
            cantidadNumeros++;
        }

        // Redimensionar el array para eliminar los elementos no utilizados
        int[] resultado = new int[cantidadNumeros];
        System.arraycopy(numeros, 0, resultado, 0, cantidadNumeros);
        return resultado;
    }

    // Función para aumentar la capacidad de un array dinámicamente
    public static int[] aumentarCapacidad(int[] array) {
        int nuevaCapacidad = array.length * 2;
        int[] nuevoArray = new int[nuevaCapacidad];
        System.arraycopy(array, 0, nuevoArray, 0, array.length);
        return nuevoArray;
    }

    // Función para calcular la media de los elementos de un array
    public static double calcularMedia(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        return (double) suma / array.length;
    }

    // Función para calcular el mínimo de los elementos de un array
    public static int calcularMinimo(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    // Función para calcular el máximo de los elementos de un array
    public static int calcularMaximo(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE;
        }
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
}
