public class Operaciones {
    public static void main(String[] args) {
        int n1 = 5, n2 = 3, resultado = 0;
        /* solo admite un int o un char / osea un entero o un solo caracte, no una cadena de caracteres */

        int parametro = 2; /*este le indica que case usar*/

        /*    ↓ adentro del switch va un parametro      */
        switch (parametro) {
            case 1:
                resultado = n1 + n2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case 2:
                resultado = n1 - n2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case 3:
                resultado = n1 * n2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;

            case 4:
                resultado = n1 / n2;
                System.out.println("El resultado de la division es: " + resultado);
                break;

            default:
                System.out.println("Error la opcion no existe");
                break;
        }
    }
}
