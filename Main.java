import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] nums = new int[4];//la cantidad de elementos del array siempre son 4

        int requiredSum=0;

        //no existen errores en tiempo de ejecución
        for(int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese en un número para la posición "+ i +" del array");
           nums[i]=scanner.nextInt();
        }

        System.out.println("--------------------------------------");
        System.out.println("Ingrese en número a formar con la suma de 2 elementos del array");
        requiredSum=scanner.nextInt();

        System.out.println("--------------------------------------");
        System.out.println("algoritmo 1: "+algoritmo1(nums, requiredSum));

        System.out.println("algoritmo 2: "+algoritmo2(nums,requiredSum));

    }

    /*
    *   Recusos infinitos, tiempo de ejecución no importa, realizar el desarrollo en el menor tiempo posible
    *   significa hacer el ejercicio lo más rápido posible, mientras cumpla el enunciado.
    * */
    public static  boolean algoritmo1(int [] nums, int requiredSum){

        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==requiredSum && i!=j){
                    return true;
                }
            }
        }

        return false;
    }

    /*
    * los recursos son finitos, tiempo de ejecución si importa y que el tiempo de desarrollo no es importante
    * significa hacer el ejercicio pensando en la solución más eficiente.
     * */
    public static  boolean algoritmo2(int [] nums, int requiredSum){

        for (int i = 0; i < (nums.length-1) ; i++) {
            for (int j = (i+1); j < nums.length; j++) {
                if(nums[i]+nums[j]==requiredSum){
                    return true;
                }
            }
        }

        return false;
    }

}