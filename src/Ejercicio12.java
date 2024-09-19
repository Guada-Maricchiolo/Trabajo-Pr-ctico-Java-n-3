import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 12");
        Scanner sc = new Scanner(System.in);

        int [] numeros3 = new int[10];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < numeros3.length; i++){
            numeros3[i] = sc.nextInt();
        }

        System.out.println("Ingrese el número a buscar:");
        int numeroIngresado = sc.nextInt();
        boolean encontrado = false;
        int vecesEncontrado = 0;
        int contador = 0;

        for (int i = 0; i < numeros3.length; i++){
            if (numeroIngresado == numeros3[i]){
                encontrado = true;
                vecesEncontrado++;
            }
        }
        int [] resultado2 = new int[10-vecesEncontrado];
        if (encontrado){
            System.out.println("Número encontrado: " + numeroIngresado);
            for (int i = 0; i < numeros3.length; i++){
                if (numeros3[i] != numeroIngresado){
                    resultado2[contador] = numeros3[i];
                    contador++;
                }
            }
        } else {
            System.out.println("No se encontró el número");
        }
        if (encontrado){
            System.out.println("NUEVO ARREGLO");
            for (int i = 0; i < resultado2.length; i++){
                System.out.println(resultado2[i]);
            }
        }
    }
}