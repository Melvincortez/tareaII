public class Main {
    public static class Busqueda {

        // Método de búsqueda binaria
        public static int busquedaBinaria(int[] array, int objetivo) {
            int inicio = 0;
            int fin = array.length - 1;

            while (inicio <= fin) {
                int medio = inicio + (fin - inicio) / 2;

                if (array[medio] == objetivo)
                    return medio;

                if (array[medio] < objetivo)
                    inicio = medio + 1;
                else
                    fin = medio - 1;
            }

            return -1; // Si no se encuentra el elemento
        }

        // Método de búsqueda secuencial
        public static int busquedaSecuencial(int[] array, int objetivo) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == objetivo)
                    return i;
            }
            return -1; // Si no se encuentra el elemento
        }

        public static void main(String[] args) {
            int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
            int objetivo = 12;

            // Busqueda Binaria
            int indiceBinario = busquedaBinaria(array, objetivo);
            if (indiceBinario != -1)
                System.out.println("El elemento " + objetivo + " fue encontrado en el índice " + indiceBinario + " (Búsqueda Binaria).");
            else
                System.out.println("El elemento " + objetivo + " no fue encontrado (Búsqueda Binaria).");

            // Búsqueda Secuencial
            int indiceSecuencial = busquedaSecuencial(array, objetivo);
            if (indiceSecuencial != -1)
                System.out.println("El elemento " + objetivo + " fue encontrado en el índice " + indiceSecuencial + " (Búsqueda Secuencial).");
            else
                System.out.println("El elemento " + objetivo + " no fue encontrado (Búsqueda Secuencial).");
        }
    }

}