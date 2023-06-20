package Service;

import Entidades.Person;
import Entidades.Staff;
import Entidades.Student;
import Entidades.Teacher;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tomyv
 */
public class University {

    private List<Person> people = new ArrayList();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Person p;

    public void options() {
        Boolean flag = true;
        do {
            System.out.println("WHAT DO YOU WISH TO DO? ");
            System.out.println("1 - REGISTER ");
            System.out.println("2 - CHANGE DATA ");
            System.out.println("3 - SEE DATA ");
            System.out.println("4 - EXIT ");
            Integer opt = sc.nextInt();
            switch (opt) {
                case 1:
                    register();
                    break;
                case 2:
                    if (people.isEmpty()) {
                        System.out.println("NOTHING REGISTERED");
                    } else {
                        changeData();
                    }
                    break;
                case 3:
                    seeData();
                    break;
                case 4:
                    System.out.println("BYE.............. ");
                    flag = false;
                    break;
                default:
                    System.out.println("INCORRECT ");
            }
        } while (flag);

    }

    public void register() {
        Boolean flag = true;
        do {
            System.out.println("1 - STUDENT ");
            System.out.println("2 - EMPLOYEE ");
            System.out.println("3 - COME-BACK ");
            Integer opt = sc.nextInt();
            switch (opt) {
                case 1:
                    p = new Student();
                    people.add(p.createPerson());
                    System.out.println("ADDED!!!");
                    break;
                case 2:
                    createEmployee();
                case 3:
                    System.out.println("COMING BACK.........");
                    flag = false;
                    options();
                default:
                    System.out.println("ERROR");
            }
        } while (flag);

    }

    public void createEmployee() {
        Boolean flag = true;
        do {
            System.out.println("1 - TEACHER ");
            System.out.println("2 - STAFF ");
            System.out.println("3 - RETURN ");
            switch (sc.nextInt()) {
                case 1:
                    p = new Teacher();
                    people.add(p.createPerson());
                    System.out.println("ADEDD!!");
                    break;
                case 2:
                    p = new Staff();
                    people.add(p.createPerson());
                    System.out.println("ADEDD!!");
                    break;
                case 3:
                    System.out.println("COMING BACK.........");
                    register();
                    flag = false;
                    break;
                default:
                    System.out.println("INCORRECT");
            }
        } while (flag);
    }

    public void changeData() {
        /**
         * @param args the command line arguments
         *
         * • Cambio del estado civil de una persona.
         *
         * • Reasignación de despacho a un empleado.
         *
         * • Matriculación de un estudiante en un nuevo curso.
         *
         * • Cambio de departamento de un profesor.
         *
         * • Traslado de sección de un empleado del personal de servicio.
         */
        
        Boolean flag = true;
        
        while (flag) {
            
            System.out.println("WHAT'S THE NAME");
            String name = sc.next();
            
            for (Person aux : people) {

                if (name.equalsIgnoreCase(aux.getCompleteName())) {
                    System.out.println("WHAT DO YOU WISH TO CHANGE");
                    System.out.println("1 - NEW MARITAL STATUS");
                    flag = false;
                    
                    if (aux instanceof Staff) {
                        System.out.println("2 - NEW SECCION");
                        System.out.println("3 - BE BACK");
                        Staff st = (Staff) aux;
                        switch (sc.nextInt()) {
                            case 1:             
                                st.changeRelationship();
                                System.out.println("DONE IT");
                                break;
                            case 2:
                                st.changeOffice();
                                System.out.println("DONE IT");
                            case 3:
                                System.out.println("COMING BACK...........");
                                options();
                                break;
                            default:
                                System.out.println("ERROR");
                        }
                    }

                    if (aux instanceof Teacher) {
                        System.out.println("2 - CHANGE OF DEANSHIP");
                        System.out.println("3 - BE BACK");
                        Teacher t = (Teacher) aux;
                        switch (sc.nextInt()) {
                            case 1:
                                t.changeRelationship();
                                System.out.println("DONE IT");
                                break;
                            case 2:
                                t.changeOffice();
                                System.out.println("DONE IT");
                            case 3:
                                System.out.println("COMING BACK...........");
                                options();
                                break;
                            default:
                                System.out.println("ERROR");
                        }
                    }

                    if (aux instanceof Student) {
                        System.out.println("2 - NEW SUBJECT");
                        System.out.println("3 - BE BACK");
                        Student st = (Student) aux;
                        switch (sc.nextInt()) {
                            case 1:
                                st.changeRelationship();
                                System.out.println("DONE IT");
                                break;
                            case 2:
                                st.changeAssignature();
                                System.out.println("DONE IT");
                            case 3:
                                System.out.println("COMING BACK...........");
                                options();
                                break;
                            default:
                                System.out.println("ERROR");
                        }
                    }

                }
                
            }
            
        }

    }

    public void seeData() {
        for (Person aux : people) {
            System.out.println(aux);
        }
    }
}
