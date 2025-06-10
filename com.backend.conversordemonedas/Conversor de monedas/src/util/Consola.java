package util;

import java.util.Scanner;

public class Consola {
    private static final Scanner scanner = new Scanner(System.in);


    public static String leer(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine());
    }

    public static void cerrar() {
        scanner.close();
    }
}
