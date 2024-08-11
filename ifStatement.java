import java.util.Scanner;

public class ifStatement{
    public static void main(String [] args){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Input 1:");
        String entrada = lectura.nextLine();
        if (entrada.equals("chiste")){
            System.out.println("¿Qué hace una abeja en el gimnasio?");
            System.out.println("¡Zum-ba! 🐝💪😄");
        } else {
            System.out.println("Usted no pidió un chiste");
        }

        System.out.println("Input 2:");
        entrada = lectura.nextLine();
        if(entrada.equals("hoy")){
            System.out.println("El año actual es 2024");
        } else {
            System.out.println("Usted no pidió el año");
        }

    }
}