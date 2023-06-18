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
public class Maestranza extends Empleado {

    private String section;

    public Maestranza() {  
    }  

    public Maestranza(Integer anioIngreso, Integer numDespacho, String nameCompl, Integer dni, String estadoCivil,String section) {
        super(anioIngreso, numDespacho, nameCompl, dni, estadoCivil);
        this.section = section;
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("SECCION");
        this.section = sc.next();
        Maestranza maes = new Maestranza(anioIngreso, numDespacho, nameCompl, dni, estadoCivil, section);
        listP.add(maes);
    }

    public void cambioSection() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Boolean flag = true;
        
        System.out.println("ESCRIBA EL DNI PARA VERIFICAR");
        Integer dniL = sc.nextInt();
        for (Persona aux : listP) {
            if (aux.getDni().equals(dniL)) {
                System.out.println("NUEVO SECCION");
                this.section = sc.next();
                flag = false;
            }
        }

        if (flag) {
            System.out.println("DNI NO ENCONTRADO");
        }

    }
}
