
package Guia_3;

import java.util.Scanner;

public class EJ_4_A {
    /**
     * @param args the command line arguments
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
     * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
     * se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase");
        String input = scanner.next();
        input = input.toUpperCase();
        if (input.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
   
