/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tomyv
 */
public class Estudiante extends Persona {

    private List materia;

    public Estudiante() {
        this.materia = new ArrayList();
    }

    public Estudiante(List materia, String nameCompl, Integer dni, String estadoCivil) {
        super(nameCompl, dni, estadoCivil);
        this.materia = materia;
    }

    @Override
    public void crearPersona() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("MATERIA");
        materia.add(sc.next());
        Estudiante est = new Estudiante(materia, nameCompl, dni, estadoCivil);
        listP.add(est);
    }

    public void nuevaCarrera() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Boolean flag = true;
        System.out.println("ESCRIBA EL DNI PARA VERIFICAR");
        Integer dniL = sc.nextInt();
        for (Persona aux : listP) {
            if (aux.getDni().equals(dniL)) {
                System.out.println("NUEVA MATERIA");
                materia.add(sc.next());
                flag = false;
            }
        }

        if (flag) {
            System.out.println("DNI NO ENCONTRADO");
        }

    }

}
