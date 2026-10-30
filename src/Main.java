import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector  = new Scanner(System.in);

        System.out.print("Numero de filas: ");
        int filas = lector.nextInt();

        System.out.print("Numero de columnas: ");
        int columnas = lector.nextInt();

        int[][] matriz = new int[filas][columnas];
        int[] suma = new int[columnas];

        // Guardamos los numeros en la matriz.
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print("Numero: ");
                matriz[fila][columna] = lector.nextInt();
            }
        }

        // Sumamos cada columna y guardamos el resultado en el vector.
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