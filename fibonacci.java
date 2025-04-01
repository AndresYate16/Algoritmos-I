import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        /* Creación de variables */
        int a = 0, b = 1, c = 0, numUser = 0, contador = 0;

        /* Creación de objetos */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos");
        System.out.print("Cuantos números de la serie de Fibonacci desea imprimir? ");
        numUser = scanner.nextInt();
        /* 0 1 1 2 3 5 
        Ciclo 0 --> a = 0 y b = 1
        Ciclo 1 --> a = 1 y b = 1
        Ciclo 2 --> a = 0 y b = 1
        Ciclo 3 --> a = 1 y b = 1
        Ciclo 4 --> a = 2 y b = 1
         
        */
        while (contador < numUser){

            System.out.print(c + " ");

            if(contador == 1){
                a = 0;
            } 

            c = a + b;
            a = b; 
            b = c;
            contador++;
        }

        scanner.close();
        
    }
}

