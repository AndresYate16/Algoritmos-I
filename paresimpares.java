import java.util.Scanner;

public class paresimpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int numeros = 0;
        for (int enteros = 0; enteros < 10; enteros++) {
            System.out.print("Ingresa un numero:");
            numeros = sc.nextInt();
            if (numeros % 2 == 0){
                pares++;

            }else{
                impares++;
            }
        }
        sc.close();
System.out.println("Numeros Pares " + pares);
System.out.println("Numeros Impares " + impares);
    }
}

