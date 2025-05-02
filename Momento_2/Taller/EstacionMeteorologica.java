import java.util.Scanner;

public class EstacionMeteorologica {
    public static void main(String[] args) {
        final int TOTAL_DIAS = 30;
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[TOTAL_DIAS];

     
        System.out.println("Ingrese las 30 temperaturas máximas del mes:");
        for (int a = 0; a < TOTAL_DIAS; a++) {
            System.out.print("Día " + (a + 1) + ": ");
            temperaturas[a] = scanner.nextDouble();
        }

       
        double maxTemp = temperaturas[0];
        double minTemp = temperaturas[0];
        double suma = 0;
        int dias = 0;

       
        for (int a = 0; a < TOTAL_DIAS; a++) {
            double temp = temperaturas[a];
            suma += temp;

            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            if (temp > 25) {
                dias++;
            }
        }

        double promedio = suma / TOTAL_DIAS;

       
        System.out.println("\nResultados del mes:");
        System.out.println("Temperatura máxima: " + maxTemp + " °C");
        System.out.println("Temperatura mínima: " + minTemp + " °C");
        System.out.println("Temperatura promedio: " + promedio + " °C");
        System.out.println("Número de días con temperatura mayor a 25 °C: " + dias);

        scanner.close();
    }
}
