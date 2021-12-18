import java.util.Scanner;

public class Suma{
    public static void main(String[]args){
        String nombre = "";
        int n1 = 0, n2 = 0, resultado = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Hola, por favor introduce tu nombre");
        nombre = in.nextLine();

        System.out.println("Por favor introducir tu primer valor");
        n1 = in.nextInt();

        System.out.println("Por favor introducir tu segundo valor");
        n2 = in.nextInt();

        /* Si me llego a equivocar al poner en un entero in.nextLine(), se puede convertir a entero con Integer.parseInt() */
        resultado = n1 + n2;

        System.out.println("Hola " + nombre + ", el resultado de la suma de tus dos valores es: " + resultado);
    }
}
