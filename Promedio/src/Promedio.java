public class Promedio{
    public static void main(String[]args){
        int mat = 6;
        int esp = 7;
        int ing = 5;
        int promedio = 0;

        promedio = (mat + esp + ing) / 3;

        if(promedio >=6){
            System.out.println("Aprovaste con el promedio de: " + promedio);
        }else{
            System.out.println("Reprovaste con el promedio de: " + promedio);
        }
    }
}
