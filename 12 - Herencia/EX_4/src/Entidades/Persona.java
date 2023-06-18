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
public class Persona {

    protected String nameCompl;
    protected Integer dni;
    protected String estadoCivil;
    private Integer tipo;
    protected List<Persona> listP;

    public Persona() {
        this.listP = new ArrayList();
        crearPersona();
    }

    public Persona(String nameCompl, Integer dni, String estadoCivil) {
        this.nameCompl = nameCompl;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public Integer getDni() {
        return dni;
    }

    public List<Persona> getListP() {
        return listP;
    }

    public void setListP(List<Persona> listP) {
        this.listP = listP;
    }

    @Override
    public String toString() {
        return "Persona{" + "nameCompl=" + nameCompl + ", dni=" + dni + ", estadoCivil=" + estadoCivil + '}';
    }

    public void crearPersona() {
        Boolean flag2 = true;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("NOMBRE COMPLETO");
        this.nameCompl = sc.next();
        System.out.println("DNI");
        this.dni = sc.nextInt();
        System.out.println("ESTADO CIVIL");
        this.estadoCivil = sc.next();
        System.out.println("¿QUIEN SE QUIERE RESGISTRAR?");
        System.out.println("1 - EMPLEADO");
        System.out.println("2 - ESTUDIANTE");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                do {
                    System.out.println("1 - MAESTRANZA");
                    System.out.println("2 - PROFESOR");
                    int option2 = sc.nextInt();
                    switch (option2) {
                        case 1:
                            Maestranza maes = new Maestranza();
                            break;
                        case 2:
                            Profesor profe = new Profesor();
                            break;
                        default:
                            System.out.println("OPCION INCORRECTA");
                    }
                } while (flag2);
                break;
            case 2:
                Estudiante est = new Estudiante();
                break;
            default:
                System.out.println("OPCION INCORRECTA");
        }
        listP.add(new Persona(nameCompl, dni, estadoCivil));
    }

    public void cambioCivil() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Boolean flag = true;

        System.out.println("ESCRIBA EL DNI PARA VERIFICAR");
        Integer dniL = sc.nextInt();
        for (Persona aux : listP) {
            if (aux.getDni().equals(dniL)) {
                System.out.println("NUEVO ESTADO CIVIL");
                this.estadoCivil = sc.next();
                flag = false;
            }
        }

        if (flag) {
            System.out.println("DNI NO ENCONTRADO");
        }

    }

}
