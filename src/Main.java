import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector  = new Scanner(System.in);

        System.out.print("Nombre de files: ");
        int filas = lector.nextInt();

        System.out.print("Nombre de columnes: ");
        int columnas = lector.nextInt();

        int[][] matriz = new int[filas][columnas];
        int[] suma = new int[columnas];

        // Guardem els nombres a la matriu.
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print("Introdueix un nombre: ");
                matriz[fila][columna] = lector.nextInt();
            }
        }

        // Sumem cada columna i guardem el resultat al vector.
        for (int columna = 0; columna < columnas; columna++) {
            for (int fila = 0; fila < filas; fila++) {
                suma[columna] = suma[columna] + matriz[fila][columna];
            }
        }

        System.out.println("\nSuma de cada columna:");
        for (int columna = 0; columna < columnas; columna++) {
            System.out.println("Columna " + (columna + 1) + ": " + suma[columna]);
        }

        lector.close();
    }
}