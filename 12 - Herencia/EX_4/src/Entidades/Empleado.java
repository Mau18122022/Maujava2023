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
public class Empleado extends Persona {

    protected Integer anioIngreso;
    protected Integer numDespacho;

    public Empleado() {
        
    }

    public Empleado(Integer anioIngreso, Integer numDespacho) {
        this.anioIngreso = anioIngreso;
        this.numDespacho = numDespacho;
    }

    public Empleado(Integer anioIngreso, Integer numDespacho, String nameCompl, Integer dni, String estadoCivil) {
        super(nameCompl, dni, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" + "anioIngreso=" + anioIngreso + ", numDespacho=" + numDespacho + '}';
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("AÑO DE INGRESO");
        this.anioIngreso = sc.nextInt();
        System.out.println("NUMERO DE DESPACHO");
        this.numDespacho = sc.nextInt();
        Empleado empl = new Empleado(anioIngreso, numDespacho, nameCompl, dni, estadoCivil);
        listP.add(empl);
    }

    public void asignacionDesp() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Boolean flag = true;
        
        System.out.println("ESCRIBA EL DNI PARA VERIFICAR");
        Integer dniL = sc.nextInt();
        for (Persona aux : listP) {
            if (aux.getDni().equals(dniL)) {
                System.out.println("NUEVO CARRERA");
                this.numDespacho = sc.nextInt();
                flag = false;
            }
        }

        if (flag) {
            System.out.println("DNI NO ENCONTRADO");
        }

    }

}
