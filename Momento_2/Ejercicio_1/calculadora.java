import com.sun.jdi.Value;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        int numA = 0, numB = 0;
        int varControl = 0;
        int Factorial = 1;

        scanner scanner = new scanner(System.in);

        System.out.println("Bienvenidos");
        while (varControl != 6) { 
            
        }
        System.out.println("1. sumar dos números\r\n" + //
                        "2. Restar dos números\r\n" + // 
                        "3. Multiplicar dos números\r\n" + // 
                        "4. Dividir dos números\r\n" + // 
                        "5. Factorial de un número\r\n" + //
                        "6. Salir\r\n");
                        System.err.println("Opcion seleccionada");
                        varControl = scanner.nextInt ();
                        
                        switch (varControl) {
                            case 1:
                            System.out.println("Ingrese el número A");
                            numA = scanner.nextInt();
                            System.out.println("Ingrese el número B");
                            numB = scanner.nextInt();
                            System.out.println(numA + " + " + numB + " = " + (numA+numB));
                                
                                break;
                                case 2:
                            System.out.println("Ingrese el número A");
                            numA = scanner.nextInt();
                            System.out.println("Ingrese el número B");
                            numB = scanner.nextInt();
                            System.out.println(numA + " - " + numB + " = " + (numA-numB));

                            break;
                            case 3:
                        System.out.println("Ingrese el número A");
                        numA = scanner.nextInt();
                        System.out.println("Ingrese el número B");
                        numB = scanner.nextInt();
                        System.out.println(numA + " * " + numB + " = " + (numA*numB));

                            break;
                            case 4:
                        System.out.println("Ingrese el número A");
                        numA = scanner.nextInt();
                        System.out.println("Ingrese el número B");
                        numB = scanner.nextInt();
                        System.out.println(numA + " / " + numB + " = " + (numA/numB));

                        break;
                        case 5:
                    System.out.println("Ingrese un número para calcular factorial");
                    numA = scanner.nextInt();
                  int contador = numA;
                  while (contador >1) { 
                    Factorial *= contador;
                    contador -= 1;
                      
                  }
                    System.out.println("El factorial de " + numA + numB + " es " + Factorial);

                        break;
                            case 6:
                        System.out.println("Gracias, hasta pronto!");

                        break;

                            default:
                            System.out.println("Opción no valida");
                               break;
                        }


        scanner.close();
    }
}

