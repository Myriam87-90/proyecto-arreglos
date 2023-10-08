import java.util.*;
public class arreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0; //contadores de los numeros positivos y negativos
        int[] numeros = new int[20]; //array que contendrá los numeros leídos por teclado
        double sumaPos = 0, sumaNeg = 0; //acumuladores para las sumas de positivos y negativos

        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 20; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }

        //recorrer el array para sumar por separado los números positivos
        // y los negativos
        for (i = 0; i < 20; i++) {

        }

    }

}
