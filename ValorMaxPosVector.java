import java.util.Scanner;

public class ValorMaxPosVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        
        System.out.println("Ingresa 8 números enteros:");
        for (int a = 0; a < 8; a++) {
            System.out.print("Número " + a + ": ");
            numeros[a] = scanner.nextInt();
        }

     
        int maximo = numeros[0];
        int posicion = 0;

        for (int a = 1; a < 8; a++) {
            if (numeros[a] > maximo) {
                maximo = numeros[a];
                posicion = a;
            }
        }

        
        System.out.println("\nEl número mayor es: " + maximo);
        System.out.println("Se encuentra en la posición: " + posicion);
        
        scanner.close();
    }
}


