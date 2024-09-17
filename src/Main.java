//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.management.StringValueExp;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trabajo práctico Nº 3 - Grupo 6");
        System.out.println("Por favor, ingrese el número del ejercicio que desee verificar");
        int num;
        String cadena ="";

        num = scanner.nextInt();
        switch (num){
            case 1 :
                System.out.println("EJERCICIO Nº1");
                System.out.println("Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?");
                System.out.println("Si intentamos acceder a un elemento fuera del tamaño de un array, se lanzará una excepción llamada ArrayIndexOutOfBoundsException. Esta excepción se produce cuando el índice utilizado para acceder a un elemento del array es menor que 0 o mayor o igual que la longitud del array.");

            case 2 :
                int [] array = new int[5];
                array[0]= 20;
                array[1]= 40;
                array[2]= 60;
                array[3]= 80;
                array[4]= 100;
                System.out.println("Los valores del Array son: ");
                for (int i = 0; i < array.length; i++){
                System.out.println("Elemento " + i + ": " + array[i]);
            }
            case 3 :
                System.out.println("Ingrese el tamaño del array");
                int tamaño = scanner.nextInt();
                int [] array2 = new int[tamaño];
                System.out.println("Ingrese el número cuyos múltiplos se almacenarán en el array");
                int numero = scanner.nextInt();
                for (int i = 0; i < array2.length; i++) {
                    array2[i] = numero * (i+1);
                System.out.println("Los valores del nuevo array son: Elemento: " + i + ": " + array2[i]);
                scanner.close();
                }

            case 4 :
                double[] numeros = new double[20];
                System.out.println("Ingrese 20 números decimales");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println("Numero " + (i+1) + ": ");
                    numeros[i] = scanner.nextDouble();
                double mayor = numeros[0];
                double menor = numeros [0];
                    if (numeros[i] > mayor) {
                        mayor = numeros[i];
                    }
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                double rango = mayor - menor;
                System.out.println("El mayor de los números es: " + mayor);
                System.out.println("El menor de los números es: " + menor);
                System.out.println("El rango de los números es: " + rango);
                }
                }

            }


            }





