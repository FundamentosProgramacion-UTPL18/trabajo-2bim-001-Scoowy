package arreglos;

/**
 *
 * @author Juan Gahona - Scoowy
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double[] cal_prog = {18, 19, 15, 16, 17, 10};
        double[] cal_bd = {10, 12, 13, 20, 17, 20};
        double[] promedios = new double[6];
        
        for (int i = 0; i < cal_prog.length; i++) {
            double prom = (cal_prog[i] + cal_bd[i]) / 2;
            promedios[i] = prom;
        }
        for (int i = 0; i < promedios.length; i++) {
            String auxEst = String.format("Est %d", i+1);
            System.out.printf("%10s%10.2f%10.2f%10.2f\n", auxEst, cal_prog[i], cal_bd[i], promedios[i]);
        }
    }
}
