import java.util.Scanner;
public class metodoMenMayEdad {
    static Scanner scanner = new Scanner(System.in);
    static int mayedad = 0;
    static int menedad = 0;
    static int edad = 1;
    
    public static void main(String[] args) {
        instrucciones();
        clasifiEdad();
        impriResultados();
    }
public static void instrucciones() {
        System.out.println("Ingrese la edad que deseas clasificar. Para finalizar ingresa 0.");
    }
public static void clasifiEdad() {     
        while (edad != 0) {
            System.out.println("Ingresa la edad:");
            edad = scanner.nextInt();
            if (edad > 0){
                if (edad >= 18){
                    mayedad ++;
                }else {
                    menedad ++;
                }   
            }else if (edad == 0){
                System.out.println("Programa terminado");
            }
        }    
    }
public static void impriResultados(){
    System.out.println(mayedad + " personas son mayores de edad y " + menedad + " personas son menores de edad");
}
}
