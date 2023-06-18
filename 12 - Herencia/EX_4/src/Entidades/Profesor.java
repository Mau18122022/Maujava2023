/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author tomyv
 */
public class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
        
    }

    public Profesor(String departamento, Integer anioIngreso, Integer numDespacho, String nameCompl, Integer dni, String estadoCivil) {
        super(anioIngreso, numDespacho, nameCompl, dni, estadoCivil);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + '}';
    }

    @Override
    public void crearPersona() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("DEPARTAMENTO");
        this.departamento = sc.next();
        Profesor profe = new Profesor(departamento, anioIngreso, numDespacho, nameCompl, dni, estadoCivil);
        listP.add(profe);
    }

    public void cambioDepartamento() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Boolean flag = true;
        System.out.println("ESCRIBA EL DNI PARA VERIFICAR");
        Integer dniL = sc.nextInt();
        for (Persona aux : listP) {
            if (aux.getDni().equals(dniL)) {
                System.out.println("NUEVO DEPARTAMENTO");
                this.departamento = sc.next();
                flag = false;
            }
        }

        if (flag) {
            System.out.println("DNI NO ENCONTRADO");
        }

    }

}
