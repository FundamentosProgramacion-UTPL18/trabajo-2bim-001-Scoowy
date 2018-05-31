package arreglos;

/**
 *
 * @author Juan Gahona - Scoowy
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int num;
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arreglo.length; i++) {
            if ((arreglo[i] % 2) == 0) {
                for (int j = 1; j <= 12; j++) {
                    num = arreglo[i] * j;
                    System.out.printf("%d x %d = %d\n", arreglo[i], j, num);
                }
                System.out.println("");
            }
        }
    }
}
