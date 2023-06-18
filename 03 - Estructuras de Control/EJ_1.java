/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author tomyv
 */
public class EJ_1_PAR {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = vlad.nextInt();
        if (num % 2 == 0){
            System.out.println("Es un numero par");
        }else{
            System.out.println("Es un numero Impar");
        }
    }
}
