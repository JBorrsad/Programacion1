/**
 * Clase Animal 
 *
 * @author
 * @version
 */

public abstract class Animal implements Nombrable{

    private String nombre;
    private int patas;
    private Persona dueño;

    /**
     * Constructor de la clase Figura
     */
    public Animal(String nombre, int patas, Persona dueño) {
        this.nombre = nombre;
        this.patas = patas;
        this.dueño = dueño;

    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPatas() {
        return patas;
    }

    public Persona getDueño() {
        return dueño;
    }

    /**
     * @override
     */
    @Override
    public int hashCode() {
        return nombre.hashCode() * 11 + patas + dueño.hashCode();
    }

}
