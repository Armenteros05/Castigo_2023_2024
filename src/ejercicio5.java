public class ejercicio5 {
    public static void main(String[] args) {
        int N = 10; // Los 10 primeros números naturales

        // Generar las tablas de multiplicar para los primeros N números
        int[][] tablasDeMultiplicar = generarTablasDeMultiplicar(N);

        // Visualizar las tablas de multiplicar por pantalla
        for (int i = 0; i < N; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + tablasDeMultiplicar[i][j]);
            }
            System.out.println();
        }
    }

    // Función para generar las tablas de multiplicar para los primeros N números
    public static int[][] generarTablasDeMultiplicar(int N) {
        int[][] tablasDeMultiplicar = new int[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tablasDeMultiplicar[i][j] = i * j;
            }
        }
        return tablasDeMultiplicar;
    }
}
