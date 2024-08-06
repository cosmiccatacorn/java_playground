import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput =  new Scanner(System.in);
        String parentesco;
        String nombre;
        int edad;
        String sexo;
        String deporteFavorito;
        System.out.print("Ingrese el número de personas en su núcleo familiar: ");
        int n = userInput.nextInt();
        userInput.nextLine();

        for(int i=0; i<(n-1); i++){
            System.out.print("Ingrese parentesco: ");
            parentesco = userInput.nextLine();
            System.out.print("Ingrese nombre: ");
            nombre = userInput.nextLine();
            System.out.print("Ingrese edad: ");
            edad = userInput.nextInt();
            System.out.print("Ingrese sexo: ");
            userInput.nextLine();
            sexo = userInput.nextLine();
            System.out.print("Ingrese deporte favorito: ");
            deporteFavorito = userInput.nextLine();

            System.out.println("Mi "+ parentesco+ " se llama " + nombre +". Su sexo es " + sexo + " y tiene " + edad + " años. Su deporte favorito es " + deporteFavorito);
        }



        System.out.println("Hora de completar sus datos!");
        System.out.print("Hasta qué año le gustaría vivir? ");
        int goal_year = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Ingrese su nombre: ");
        nombre = userInput.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Ingrese su sexo: ");
        sexo = userInput.nextLine();
        System.out.print("Ingrese su deporte favorito: ");
        deporteFavorito = userInput.nextLine();

        int birth_year = 2024- edad;

        System.out.println("Mi nombre es "+ nombre + ", tengo "+ edad + " años y mi sexo es " + sexo + ". Mi deporte favorito es " + deporteFavorito + ". ");
        System.out.println("Me gustaría vivir hasta " + goal_year + ", lo que quiere decir que viviré hasta los " + (goal_year-birth_year) + " años y me quedan por vivir " + (goal_year - 2024));

    }
}
