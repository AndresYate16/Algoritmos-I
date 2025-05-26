import java.util.Scanner;

public class AnalisisEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ESTUDIANTES = 5;
        final int ASIGNATURAS = 4;

        // Vector para nombres de estudiantes
        String[] nombres = new String[ESTUDIANTES];

        // Matriz 5x4 para almacenar las notas
        double[][] notas = new double[ESTUDIANTES][ASIGNATURAS];

        // Vector para almacenar promedios
        double[] promedios = new double[ESTUDIANTES];

        // Ingreso de datos
        System.out.println("=== Ingreso de datos ===");
        for (int i = 0; i < ESTUDIANTES; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.print("Nota " + (j + 1) + " para " + nombres[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Limpiar buffer
        }

        // Variables para encontrar mejor y peor promedio
        double mejorPromedio = -1;
        double peorPromedio = 101;
        String mejorEstudiante = "";
        String peorEstudiante = "";

        // Cálculo de promedios y estado (aprobado/reprobado)
        System.out.println("\n=== Reporte Final ===");

        for (int i = 0; i < ESTUDIANTES; i++) {
            double suma = 0;

            for (int j = 0; j < ASIGNATURAS; j++) {
                suma += notas[i][j];
            }

            promedios[i] = suma / ASIGNATURAS;

            // Determinar mejor y peor estudiante
            if (promedios[i] > mejorPromedio) {
                mejorPromedio = promedios[i];
                mejorEstudiante = nombres[i];
            }

            if (promedios[i] < peorPromedio) {
                peorPromedio = promedios[i];
                peorEstudiante = nombres[i];
            }

            // Evaluar si aprueba o reprueba
            String estado = promedios[i] >= 60 ? "Aprobado" : "Reprobado";

            // Mostrar reporte individual
            System.out.println("Estudiante: " + nombres[i]);
            System.out.println("Promedio: " + promedios[i]);
            System.out.println("Estado: " + estado);
            System.out.println("-----------------------------");
        }

        // Mostrar mejor y peor estudiante
        System.out.println("Mejor estudiante: " + mejorEstudiante + " con promedio de " + mejorPromedio);
        System.out.println("Peor estudiante: " + peorEstudiante + " con promedio de " + peorPromedio);

        scanner.close();
    }
}
