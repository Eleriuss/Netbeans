import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de internos registrados: ");
        int totalInternos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Arreglos para almacenar nombres y condenas
        String[] nombres = new String[totalInternos];
        int[] condenasMeses = new int[totalInternos];

        // Captura de datos
        for (int i = 0; i < totalInternos; i++) {
            System.out.print("Ingrese el nombre del interno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la condena en meses de " + nombres[i] + ": ");
            condenasMeses[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Contador de internos con menos de 36 meses de condena
        int internosCumplenCondicion = 0;

        // Impresión de datos de internos con menos de 36 meses de condena
        System.out.println("\nInternos con menos de 36 meses de condena:");
        for (int i = 0; i < totalInternos; i++) {
            if (condenasMeses[i] < 36) {
                System.out.println("Nombre: " + nombres[i] + ", Condena (meses): " + condenasMeses[i]);
                internosCumplenCondicion++;
            }
        }

        System.out.println("\nCantidad total de internos que cumplen con la condición: " + internosCumplenCondicion);
    }
}
