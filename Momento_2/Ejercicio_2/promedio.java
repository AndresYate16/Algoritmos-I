import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int numero = -1 ;
      int suma = 0 ;
      int contador = 0;
        while (numero != 0) {
            System.out.print("Ingrese un numero, o ingrese 0 para terminar el programa: ");
            numero = sc.nextInt();
            if (numero > 0){
                suma = suma + numero;
                contador ++;
            }
            }         
            sc.close();
    if (contador > 0){
            double promedio = suma / contador ;
            System.out.println("El promedio de numeros positivos es " + promedio); 

    }else {
            System.out.println("Los numeros  ingresados no son positivos");
        }
    }
}

