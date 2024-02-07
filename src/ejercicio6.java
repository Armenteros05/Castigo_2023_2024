public class ejercicio6 {
    public static void main(String[] args) {
        int N = 10; // Número de primeros números primos a encontrar

        // Obtener los N primeros números primos
        int[] primerosPrimos = obtenerPrimos(N);

        // Imprimir los N primeros números primos
        System.out.println("Los primeros " + N + " números primos son:");
        for (int primo : primerosPrimos) {
            System.out.print(primo + " ");
        }
    }

    // Función para obtener los N primeros números primos
    public static int[] obtenerPrimos(int N) {
        int[] primos = new int[N];
        int count = 0;
        int numero = 2; // Empezamos desde el primer número primo

        while (count < N) {
            if (esPrimo(numero)) {
                primos[count] = numero;
                count++;
            }
            numero++;
        }

        return primos;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
