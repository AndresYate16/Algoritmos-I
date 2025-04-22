import java.util.Scanner;

public class GestionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        double[][] calificaciones = new double[numEstudiantes][3];

        for (int a = 0; a < numEstudiantes; a++) {
            System.out.println("Ingrese las 3 calificaciones del estudiante " + (a + 1) + ":");
            for (int b = 0; b < 3; b++) {
                System.out.print("  Examen " + (b + 1) + ": ");
                calificaciones[a][b] = scanner.nextDouble();
            }
        }

        double[] promedios = new double[numEstudiantes];
        int aprobados = 0;
        int reprobados = 0;

        for (int a = 0; a < numEstudiantes; a++) {
            double suma = 0;
            for (int b = 0; b < 3; b++) {
                suma += calificaciones[a][b];
            }
            promedios[a] = suma / 3;

            if (promedios[a] >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("\nResultados:");
        for (int a = 0; a < numEstudiantes; a++) {
            System.out.println("Estudiante " + (a + 1) + " - Promedio final: " + promedios[a]);
        }
        
        System.out.println("\nTotal de estudiantes aprobados: " + aprobados);
        System.out.println("Total de estudiantes reprobados: " + reprobados);

        scanner.close();
        
    }
}
