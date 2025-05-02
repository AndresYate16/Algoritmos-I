import java.util.Scanner;

public class SumaDiagonales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;

        do {
            System.out.print("Ingrese el tamaño de la matriz (<= 5): ");
            t = scanner.nextInt();
        } while (t > 5 || t <= 0);

        int[][] matriz = new int[t][t];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int a = 0; a < t; a++) {
            for (int b = 0; b < t; b++) {
                System.out.print("Elemento [" + a + "][" + b + "]: ");
                matriz[a][b] = scanner.nextInt();
            }
        }

        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        for (int a = 0; a < t; a++) {
            sumaPrincipal += matriz[a][a];
            sumaSecundaria += matriz[a][t - 1 - a]; 
        }

        System.out.println("\nMatriz ingresada:");
        for (int a = 0; a < t; a++) {
            for (int b = 0; b < t; b++) {
                System.out.print(matriz[a][b] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);

        scanner.close();
    }
}