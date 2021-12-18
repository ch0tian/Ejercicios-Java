import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        String nombre = "";
        int clave = 0, antiguedad = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");

        System.out.println("Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Cual es el numero de años en la compañia?");
        antiguedad = in.nextInt();

        System.out.println("Cual es tu clave?");
        clave = in.nextInt();

        if (clave == 1) {
            if (antiguedad == 1) {
                System.out.println(nombre + " tiene derecho a 6 dias");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " tiene derecho a 14 dias");
            } else if (antiguedad == 7 || antiguedad > 7) {
                System.out.println(nombre + " tiene derecho a 20 dias");
            } else {
                System.out.println(nombre + " aun no tiene derecho a vacaciones");
            }
        }
        else if (clave == 2) {
            if (antiguedad == 1) {
                System.out.println(nombre + " tiene derecho a 7 dias");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " tiene derecho a 15 dias");
            } else if (antiguedad == 7 || antiguedad > 7) {
                System.out.println(nombre + " tiene derecho a 22 dias");
            } else {
                System.out.println(nombre + " aun no tiene derecho a vacaciones");
            }
        }
        else if (clave == 3) {
            if (antiguedad == 1) {
                System.out.println(nombre + " tiene derecho a 10 dias");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " tiene derecho a 20 dias");
            } else if (antiguedad == 7 || antiguedad > 7) {
                System.out.println(nombre + " tiene derecho a 30 dias");
            } else {
                System.out.println(nombre + " aun no tiene derecho a vacaciones");
            }
        } else {
            System.out.println(nombre + " has cometido un error, esa informacion no existe, por favor verificala");
        }
    }
}
