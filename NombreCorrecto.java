import java.util.Scanner;

public class NombreCorrecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un nombre:");
        String nombre = scanner.nextLine();

        if (nombre.equalsIgnoreCase("paco")) {
            System.out.println("Nombre correcto");
        } else {
            System.out.println("Nombre incorrecto");
        }

        scanner.close();
    }
}
