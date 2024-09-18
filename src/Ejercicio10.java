import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        mensajeInicial();
        int numeroDNI = entrada();
        String letra = obtenerLetra(numeroDNI);
        salida(numeroDNI, letra);
    }

    public static void mensajeInicial() {
        System.out.println("Este programa calcula la letra de un DNI a partir del número de DNI que introduzca el usuario y devuelve el DNI completo");
    }

    public static int entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su DNI sin puntos ni espacios");
        int numeroDNI = sc.nextInt();
        return numeroDNI;
    }

    public static String obtenerLetra(int numeroDNI) {
        String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicion = numeroDNI % 23;
        return letra[posicion];
    }

    public static void salida(int numeroDNI, String letra) {
        String dniConLetra = numeroDNI + letra;
        System.out.println("Su dni completo es " + dniConLetra);
    }
}