package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author tomyv
 */
public class EJ_1 {

    /**
     * @param args the command line arguments
     *
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
     * Caballo.
     *
     * La clase Animal tendrá como atributos el nombre, alimento, edad y raza
     * del Animal.
     *
     * Crear un método en la clase Animal a través del cual cada clase hija
     * deberá mostrar luego un mensaje por pantalla informando de que se
     * alimenta.
     *
     * Generar una clase Main que realice lo siguiente:
     */
    public static void main(String[] args) {
        Animal p = new Perro("LUCAS","CARNE",2,"BEAGLE");
        Animal g = new Gato("ISMAEL","ATUN",1,"EGIPCIO");
        Animal c = new Caballo("ARMANI","GOLES DE CANO",30,"GALLINA PUTA");
        
        p.alimentarse();
        g.alimentarse();
        c.alimentarse();
        
        
    }

}
