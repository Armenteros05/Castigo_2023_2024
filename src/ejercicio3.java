public class ejercicio3{
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        // Generar el array de múltiplos de 5
        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);

        // Imprimir cada múltiplo de 5
        System.out.println("Múltiplos de 5 entre 1 y 100:");
        for (int num : multiplosDe5) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calcular la suma de los múltiplos de 5
        int sumaMultiplosDe5 = calcularSuma(multiplosDe5);

        // Imprimir la suma de los múltiplos de 5
        System.out.println("La suma de los múltiplos de 5 es: " + sumaMultiplosDe5);
    }

    // Función para obtener los múltiplos de 5 en el rango especificado
    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int cantidadMultiplos = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                cantidadMultiplos++;
            }
        }
        int[] multiplosDe5 = new int[cantidadMultiplos];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplosDe5[index] = i;
                index++;
            }
        }
        return multiplosDe5;
    }

    // Función para calcular la suma de los valores en un array
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
}
