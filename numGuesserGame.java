import java.util.*;
import java.io.*;
import java.lang.*;

public class numGuesser {

        public static void main(String[] args) {
            //Crear instancia de Scanner y Random
            Scanner userInput = new Scanner(System.in);
            Random randomPicker = new Random();

            boolean not_guessed = true;
            //Elegir un entero aleatorio
            int randomNumber = randomPicker.nextInt(101);
            int guess;
            //Solicitar al usuario un entero y prevenir bugs
            while (not_guessed) {
                try {
                    System.out.println("Ingrese un número entero entre 0 y 100");
                    guess = userInput.nextInt();
                    userInput.nextLine();
                    if (guess < 0 || guess > 100) {
                        System.out.println("Number out of range! Enter an integer between 0 and 100");
                    }
                    if (guess > randomNumber) {
                        System.out.println("Es un número menor! Inténtalo de nuevo");
                    } else if (guess < randomNumber){
                        System.out.println(("Es un número mayor. Inténtalo de nuevo"));
                    } else {
                        System.out.println("Has ganado, número adivinado!!!");
                    }
                    if (guess == randomNumber) {
                        not_guessed = false;
                    }

                } catch (Exception e) {
                    System.out.println("Valor no válido. Fin del juego");
                }
            }
        }
}
// I think we're done for today!
