import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        final int cantidad = 10; 
        char[] caracteres = new char[cantidad];
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingresa 10 caracteres uno por uno:");
        for (int a = 0; a < cantidad; a++) {
            System.out.print("Caracter " + (a + 1) + ": ");
            String input = scanner.nextLine();
            caracteres[a] = input.charAt(0); 
        }

       
        int contadorVocales = 0;
        for (int a = 0; a < cantidad; a++) {
            char c = Character.toLowerCase(caracteres[a]); 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

    
        System.out.println("Cantidad de vocales ingresadas: " + contadorVocales);

        scanner.close();
    }
}

