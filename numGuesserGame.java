import java.util.*;
import java.io.*;
import java.lang.*;

public class numGuesserGame {

        public static void main(String[] args) {
            //Crear instancia de Scanner y Random
            Scanner userInput = new Scanner(System.in);
            Random randomPicker = new Random();

            boolean not_guessed = true;
            //Elegir un entero aleatorio
            int randomNumber = randomPicker.nextInt(101);
            //Solicitar al usuario un entero y prevenir bugs
            while (not_guessed) {
                try {
                    System.out.println("Ingrese un número entero entre o y 101");
                    int guess = userInput.nextInt();
                    if (guess < 0 || guess > 100) {
                        throw new ArithmeticException("Number out of range! Enter an integer betweenn 0 and 100");
                    }
                    if (guess > randomNumber) {
                        System.out.println("Es un número menor! Inténtalo de nuevo");
                    } else if (guess < randomNumber){
                        System.out.println(("Es un número mayor. Inténtalo de nuevo"));
                    } else {
                        System.out.println("Haas ganado, número adivinado!!!");
                    }
                    if (guess == randomNumber) {
                        not_guessed = false;
                    }

                } catch (Exception e) {
                    //comando jajaj
                }
            }
            }
        }
