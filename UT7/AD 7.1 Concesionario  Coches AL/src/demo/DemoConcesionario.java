package demo;

import modelo.*;

/**
 * Clase demo.DemoConcesionario
 *
 */

public class DemoConcesionario {

    private Concesionario con;

    /**
     * Constructor de la clase demo.DemoConcesionario
     */
    public DemoConcesionario(String nombre) {
        con = new Concesionario(nombre);
        con.leerConcesionarioDeFicheroTexto();

    }

    /**
     *
     */
    public void demoListarCoches() {
        con.listarCoches();

    }

    /**
     *
     */
    public void demoAvanzar() {
        con.avanzarTodos();

    }

    /**
     *
     */
    public void demoBorrarDeConductor(String conductor) {
        con.borrarDeConductor(conductor);
    }

    /**
     *
     */
    public void demoBorrarTaxis() {

        con.borrarTaxis();

    }

    /**
     *
     */
    public void demoListarOrdenadoConductor() {

        con.listarOrdenadoConductor();

    }

    /**
     * Aceptar como argumento el nombre del concesionario y -
     * listar el concesionario -
     * avanzar todos los coches y volver a listar -
     * borrar los del conductor "Jesus" -
     * listar el concesionario -
     * borrar los taxis -
     * listar el concesionario
     * mostrar el listado ordenado por conductor -
     */
    public static void main(String[] args) {

    }
}
