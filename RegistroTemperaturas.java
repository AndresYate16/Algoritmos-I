import java.util.Scanner;

public class RegistroTemperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double suma = 0;
        boolean hayFiebre = false;

       
        for (int a = 0; a < 7; a++) {
            System.out.print("Ingrese la temperatura del día " + (a + 1) + ": ");
            temperaturas[a] = scanner.nextDouble();
            suma += temperaturas[a];

          
            if (temperaturas[a] > 38.0) {
                hayFiebre = true;
            }
        }

        
        double promedio = suma / 7.0;
        System.out.printf("El promedio de las temperaturas es: %.2f°C\n", promedio);

        
        if (hayFiebre) {
            System.out.println("¡Alerta! Tienes fiebre, tu temperatura es superior a 38°C.");
        }

        scanner.close();
    }
}
