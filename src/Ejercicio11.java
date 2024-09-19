import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 11");
        int[] numeros = new int[5];
        int[] numeros2 = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores del primer arreglo:");
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("Ingrese los valores del segundo arreglo:");
        for (int i = 0; i < numeros2.length; i++){
            numeros2[i] = sc.nextInt();
        }

        System.out.println("Arreglo 1:");
        for(int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\nArreglo 2:");
        for(int n : numeros2) {
            System.out.print(n + " ");
        }

        System.out.println("\nArreglo 3:");
        int[] resultado = new int[5];
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros2.length; j++){
                resultado[i] += numeros[i] * numeros2[j];
            }
            System.out.print(resultado[i] + " ");
        }
    }
}