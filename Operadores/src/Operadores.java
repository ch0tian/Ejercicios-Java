public class Operadores{
    public static void main(String[]args){
        int n1 = 6;
        int n2 = 2;
        int resultado = 0;

        resultado = n1 + n2 / 2;
        System.out.println("El resultado incorrecto de es: " + resultado);

        /*El detalle aqui es que la computadore lee de derecha a izquierda por eso tenemos que asignarle
        un orden correcto con los parentesis para que no escoja n2 / 2, mas n1. Si no n1 + n2 y
        luego / 2 */

        resultado = (n1 + n2) / 2;
        System.out.println("El resultado correcto de es: " + resultado);
    }
}
