public class MetodosEjercicio3 {
    public static void rellenarArrayconMultiplosDe(int numero, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numero * (i + 1);
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.println("Los valores del nuevo array son: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento: " + (i + 1) + ": " + array[i]);
        }
    }
}
