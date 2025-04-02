import java.util.Scanner;

public class vector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        int sumaTotal = 0;

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        
        for (int num : vector) {
            sumaTotal += num;
        }

      
        System.out.println("La suma total de los elementos es: " + sumaTotal);

        sc.close();
    }
}
