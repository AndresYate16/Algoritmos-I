import java.util.Scanner;

public class PalindromoNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroUsuario = -1;

        
        while (numeroUsuario < 0) {
            System.out.print("Ingrese un número entero positivo: ");
            numeroUsuario = scanner.nextInt();
        }

        int numero = numeroUsuario;
        int reverso = 0;

        while (numero > 0) {
            int digito = numero % 10;         
            reverso = reverso * 10 + digito;  
            numero = numero / 10;             
        }

        if (reverso == numeroUsuario) {
            System.out.println(numeroUsuario + " es un palíndromo.");
        } else {
            System.out.println(numeroUsuario + " no es un palíndromo.");
        }

        scanner.close();
    }
}
