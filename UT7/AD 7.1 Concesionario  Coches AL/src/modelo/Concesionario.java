package modelo;

import java.util.List;
import java.util.Scanner;

public class Concesionario {

    private String nombre;
    private List<Coche> coches;

    /**
     * Constructor de la clase modelo.Concesionario
     */
    public Concesionario(String n) {

    }

    /**
     * acccsor para el nombre del concesionario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Añade un c
     */
    public void añadir(Coche c) {

    }

    /**
     *   obtiene un listado ordenado por nombre de conductor especificando adem�s el
     *   tipo de coche que posee. No se modifica la colección de coches
     */
    public void listarOrdenadoConductor() {

    }

    /**
     * Leer del fichero de texto "concesionario.txt" los datos de cada coche
     * y añadirlos al concesionario
     *
     * Con ayuda del método privado parsearLinea()  extraeremos los datos de un coche
     *
     */
    public void leerConcesionarioDeFicheroTexto() {

        Scanner entrada = new Scanner(
                this.getClass().getResourceAsStream("/concesionario.txt"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            Coche coche = parsearLinea(linea);
            añadir(coche);
        }
        entrada.close();

    }

    /**
     *  parsea una línea de texto extrayendo los datos y devolviendo un objeto modelo.Coche
     *  El formato de la línea en el fichero ser:
     * 		 tipocoche:conductor:modelo:color  para  tipocoche 'D' (deportivo)
     *       tipocoche:conductor:modelo:color:posx:posy  para  tipocoche 'E' (económico)
     *  	 tipocoche:conductor:modelo:color:posx:posy:plazas  para  tipocoche 'T' (taxi)
     *
     */
    private Coche parsearLinea(String linea) {

        return null;
    }

    /**
     * Borrar del concesionario los coches del conductor indicado por el
     * parámetro quien
     */
    public void borrarDeConductor(String quien) {

    }

    /**
     * listado del concesionario
     */
    public void listarCoches() {

    }

    /**
     *
     *  borrar del concesionario los taxis
     */
    public void borrarTaxis() {

    }

    /**
     * avanzar todos los coches
     */
    public void avanzarTodos() {

    }

}
