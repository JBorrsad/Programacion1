/**
 * Representa una persona
 */
public class Persona implements Nombrable{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() * 11 + edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad();
    }

    public void print(){

        System.out.println("miau");
    }
}



