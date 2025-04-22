import java.util.Scanner;

public class TorneoPuntuaciones { 
 // String estaba escrito con minusculas (main(string[] args)
    public static void main(String[] args) { 
// Declarar vector para 5 puntuaciones 
// Faltaba el ; al final
        int[] puntuaciones = new int[5];
 //NO se habia importado la utlidad del scaner
        Scanner teclado = new Scanner(System.in); 
        int puntuacionMaxima = 0; 
 
        System.out.println("Ingrese las 5 puntuaciones de los jugadores:"); 
 
        // Ciclo para ingresar puntuaciones 
        //El contador le hacia falta un +
        for (int i = 0; i < puntuaciones.length; i++) { 
            System.out.print("Puntuación jugador " + (i + 1) + ": "); 
            puntuaciones[i] = teclado.nextInt(); 
 
            // Comprobar si es la puntuación máxima
            // Error de logico ya que revisa si la puntuacion es menor a la maxima para actualizarla (puntuaciones[i] < puntuacionMaxima) 
            if (puntuaciones[i] > puntuacionMaxima) { 
                puntuacionMaxima = puntuaciones[i]; 
            } 
        } 
 
        // Mostrar puntuaciones (bucle while incorrecto) 
        System.out.println("\nPuntuaciones ingresadas:"); 
        int k = 0;
        // k estaba dando una asignacion mas no una condicion, adicional no se tenia un contador por lo que el ciclo se hacia infinito
        while (k < puntuaciones.length) {
            System.out.println("Jugador " + (k + 1) + ": " + puntuaciones[k]);
            k++; // ¡Incremento de k es crucial para evitar un bucle infinito!
        }
        // Mostrar puntuación máxima 
        System.out.println("\nLa puntuación máxima fue: " + puntuacionMaxima); 
        teclado.close();
    }
}
