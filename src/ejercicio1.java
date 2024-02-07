public class ejercicio1 {
    public static void main(String[] args) {
        // Definir las variables que representan el tiempo
        byte diasEnUnAnio = (byte) 365;
        byte horasEnUnDia = 24;
        byte minutosEnUnaHora = 60;
        byte segundosEnUnMinuto = 60;

        // Calcular el número de segundos en un año
        int segundosEnUnAnio = calcularSegundosEnUnAnio(diasEnUnAnio, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);

        // Imprimir el resultado
        System.out.println("Número de segundos en un año: " + segundosEnUnAnio);
    }

    // Función para calcular el número de segundos en un año
    public static int calcularSegundosEnUnAnio(int diasEnUnAnio, int horasEnUnDia, int minutosEnUnaHora, int segundosEnUnMinuto) {
        int segundosEnUnDia = horasEnUnDia * minutosEnUnaHora * segundosEnUnMinuto;
        return diasEnUnAnio * segundosEnUnDia;
    }
}
