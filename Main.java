import java.util.Scanner;
//import java.lang.reflect.Field;

public class Main {
    public static void main(String [] args){
        Scanner lectura = new Scanner(System.in);


        System.out.print("Ingrese el nombre: ");
        String nombre = lectura.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = lectura.nextInt();
        System.out.print("Ingrese el código: ");
        int codigo = lectura.nextInt();
        System.out.println("Ingrese las notas seguidas de un enter:");
        System.out.print("Primer corte: ");
        double nota1 = lectura.nextDouble();
        System.out.print("Segundo corte: ");
        double nota2 = lectura.nextDouble();
        System.out.print("Tercer corte: ");
        double nota3 = lectura.nextDouble();
        System.out.print("Ingrese año de graduación: ");
        int gradYear = lectura.nextInt();

        Estudiante estudiante = new Estudiante(nombre, edad, codigo, nota1, nota2, nota3, gradYear);

        System.out.print("La nota final es: " + (nota1*0.3 + nota2*0.3 + nota3*0.4));

        System.out.println("La nota final de " + estudiante.nombre + " es " + estudiante.notaFinal());
        System.out.println(estudiante.nombre + " ha " + estudiante.estado() + " la asignatura");
        //Estudiante jaco = new Estudiante("Jacobo Sandoval", 12, 15180001, 2028);
        //Estudiante loren = new Estudiante("Loren Díaz", 16, 15180016, 2024);

        System.out.println("Edad con la que se gradúa el estudiante " + estudiante.nombre +": "+ estudiante.findGradAge());

    }
}
