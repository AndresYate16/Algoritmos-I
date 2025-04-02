import java.util.Scanner;
public class matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] califi = new double[3][4];
        System.out.println("Ingrese las notas de los estudiantes:");
        for (int e = 0; e < 3; e++) {
            System.out.println("Estudiante " + (e + 1) );
            for (int a = 0; a < 4; a++) {
                System.out.print("Asignatura " + (a + 1) + ": ");
                califi[e][a] = sc.nextDouble();
            }
        }
        // Calcular y mostrar el promedio de cada estudiante
        System.out.println("\nPromedio de cada estudiante:");
        for (int e = 0; e < 3; e++) {
            double sumaNotas = 0;
            for (int a = 0; a < 4; a++) {
                sumaNotas += califi[e][a];
            }
            double promedio = sumaNotas / 4;
            System.out.println("Estudiante " + (e + 1) + ": " + promedio);
        }

        sc.close();
    }
}


