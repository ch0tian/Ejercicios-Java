/*Realizar un programa que pueda realizar una suma, una resta, una multiplicación o una división de
dos números enteros, dependiendo de la decisión del usuario:
Si operación es igual a 1, realizar una suma
Si operación es igual a 2, realizar una resta
Si operación es igual a 3, realizar una multiplicación
Si operación es igual a 4, realizar una división*/
public class OperacionesAnidadas{
    public static void main(String[]args){

        int operacion = 1;
        int n1 = 2;
        int n2 = 3;
        int resultado = 0;

        if(operacion == 1){
            resultado = n1 + n2;
            System.out.println("El resultado de la suma es: " + resultado);
        }else if(operacion == 2){
            resultado = n1 - n2;
            System.out.println("El resultado de la resta es: " + resultado);
        }else if(operacion == 3){
            resultado = n1 * n2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        }else if(operacion == 4){
            resultado = n1 / n2;
            System.out.println("El resultado de la divicion es: " + resultado);
        }else{
            System.out.println("Esa operacion no existe!, por favor intentalo de nuevo...");
        }
    }
}
