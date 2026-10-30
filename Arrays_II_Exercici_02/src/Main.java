import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Nombre de files: ");
        int files = lector.nextInt();

        System.out.print("Nombre de columnes: ");
        int columnes = lector.nextInt();

        int[][] matriu = new int[files][columnes];
        int[][] resultats = new int[3][columnes];

        // Llegim els nombres de la matriu.
        for (int fila = 0; fila < files; fila++) {
            for (int columna = 0; columna < columnes; columna++) {
                System.out.print("Introdueix un nombre: ");
                matriu[fila][columna] = lector.nextInt();
            }
        }

        // Inicialitzem suma, valor mes alt i valor mes petit.
        for (int columna = 0; columna < columnes; columna++) {
            resultats[0][columna] = matriu[0][columna];
            resultats[1][columna] = matriu[0][columna];
            resultats[2][columna] = matriu[0][columna];
        }

        // Calculem els tres resultats de cada columna.
        for (int fila = 1; fila < files; fila++) {
            for (int columna = 0; columna < columnes; columna++) {
                resultats[0][columna] = resultats[0][columna] + matriu[fila][columna];

                if (matriu[fila][columna] > resultats[1][columna]) {
                    resultats[1][columna] = matriu[fila][columna];
                }

                if (matriu[fila][columna] < resultats[2][columna]) {
                    resultats[2][columna] = matriu[fila][columna];
                }
            }
        }

        // Mostrem els resultats.
        for (int columna = 0; columna < columnes; columna++) {
            System.out.println("\nColumna " + (columna + 1) + ":");
            System.out.println("Suma: " + resultats[0][columna]);
            System.out.println("Valor mes alt: " + resultats[1][columna]);
            System.out.println("Valor mes petit: " + resultats[2][columna]);
        }

        lector.close();
    }
}
