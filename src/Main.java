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
        String cadena = "";

        num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("EJERCICIO Nº1");
                System.out.println("Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?");
                System.out.println("Si intentamos acceder a un elemento fuera del tamaño de un array, se lanzará una excepción llamada ArrayIndexOutOfBoundsException. Esta excepción se produce cuando el índice utilizado para acceder a un elemento del array es menor que 0 o mayor o igual que la longitud del array.");
                break;

            case 2:
                int[] array = new int[5];
                array[0] = 20;
                array[1] = 40;
                array[2] = 60;
                array[3] = 80;
                array[4] = 100;
                System.out.println("Los valores del Array son: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Elemento " + i + ": " + array[i]);
                }
                break;
            case 3:
                System.out.println("Ingrese el tamaño del array");
                int tamaño = scanner.nextInt();
                int[] array2 = new int[tamaño];
                System.out.println("Ingrese el número cuyos múltiplos se almacenarán en el array");
                int numero = scanner.nextInt();
                for (int i = 0; i < array2.length; i++) {
                    array2[i] = numero * (i + 1);
                    System.out.println("Los valores del nuevo array son: Elemento: " + i + ": " + array2[i]);
                    scanner.close();
                }
                break;

            case 4:
                double[] numeros = new double[20];
                System.out.println("Ingrese 20 números decimales");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println("Numero " + (i + 1) + ": ");
                    numeros[i] = scanner.nextDouble();
                    double mayor = numeros[0];
                    double menor = numeros[0];
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
                break;
            case 5:
                int i;
                double promedios = 0;
                int suma = 0;
                int contador1 = 0;
                int contador2 = 0;
                int contador3 = 0;
                int[] numerosPares = new int[20];
                for (i = 0; i < numerosPares.length; i++) {
                    int aleatorio = (int) (Math.random() * 100) + 1;
                    if (aleatorio % 2 == 0) {
                        numerosPares[i] = aleatorio;
                    } else {
                        i = (i - 1);
                    }
                }
                for (i = 0; i < numerosPares.length; i++) {
                    suma = suma + numerosPares[i];
                }
                promedios = (suma / numerosPares.length);
                System.out.println(promedios);
                for (i = 0; i < numerosPares.length; i++) {
                    if (numerosPares[i] == promedios) {
                        contador1++;
                    } else if (numerosPares[i] > promedios) {
                        contador2++;
                    } else
                        contador3++;
                }
                System.out.println("El promedio de los numeros es: " + promedios);
                System.out.println("La cantidad de números iguales al promedio son: " + contador1);
                System.out.println("La cantidad de números mayores al promedio son: " + contador2);
                System.out.println("La cantidad de números mayores al promedio son: " + contador3);
                break;
            case 6:
                array = new int[50];
                for (i = 0; i < array.length; i++) {
                    int aleatorio = (int) (Math.random() * 100);
                    array[i] = aleatorio;
                }
                System.out.println("Ingrese el valor que desea buscar en el arreglo:");
                int valor = scanner.nextInt();
                boolean encontrado = false;
                for (i = 0; i < array.length; i++) {
                    if (array[i] == valor) {
                        System.out.println("El valor se encuentra en la posición del arreglo: " + i);
                        i = array.length - 1;
                        encontrado = true;

                    } else if ((i == array.length - 1) && (encontrado == false)) {
                        System.out.println("El valor ingresado no se encuentra en el array");
                    }
                }
                break;
            case 7:
                int pares = 0;
                int impares = 0;
                array = new int[20];
                System.out.println("Ingrese un conjunto de 20 valores:");
                for (i = 0; i < array.length; i++) {
                    array[i] = scanner.nextInt();
                }
                for (i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        pares = pares + array[i];
                    } else {
                        impares = impares + array[i];
                    }
                }
                System.out.println("La suma de los números pares es: " + pares);
                System.out.println("La suma de los números impares es: " + impares);
                break;
            case 8:
                array = new int[10];

                System.out.println("Ingrese 10 dígitos enteros:");
                for (i = 0; i < 10; i++) {
                    System.out.print("Dígito " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                }

                int[] ascendente = new int[array.length];
                int[] descendente = new int[array.length];

                //Copiar Arrays

                System.arraycopy(array, 0, ascendente, 0, array.length);
                System.arraycopy(array, 0, descendente, 0, array.length);

                //Ordenar Arrays

                MetodosEjercicio8.burbujaAscendente(ascendente);
                MetodosEjercicio8.burbujaDescendente(descendente);

                System.out.println("Array en orden ascendente: " + MetodosEjercicio8.arrayToString(ascendente));
                System.out.println("Array en orden descendente: " + MetodosEjercicio8.arrayToString(descendente));
                break;

            case 9:
                System.out.print("Ingrese una cadena de números separados por guiones: ");
                scanner.nextLine();
                String input = scanner.nextLine();

                String[] numerosStr = input.split("-");

                int suma1 = 0;
                int conteo = numerosStr.length;

                for (i = 0; i < conteo; i++) {
                    suma1 += Integer.parseInt(numerosStr[i]);
                }
                double promedio = (double) suma1 / conteo;


                System.out.println("Suma total: " + suma1);
                System.out.println("Promedio: " + promedio);
                break;


            case 10:
                Ejercicio10.main(args);
                break;


        }
    }
}





