import java.util.Scanner;

public class vector2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        boolean encontrado = false;

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

      
        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscado = sc.nextInt();

        
        for (int num : vector) {
            if (num == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

     
        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " fue encontrado en el vector.");
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }

        sc.close();
    }
}
