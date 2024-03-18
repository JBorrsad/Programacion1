/**
 *
 *
 */
public abstract class Fichero {
    private String titulo;
    private int tamaño;

    /**
     *
     */
    public Fichero(String titulo, int tamaño) {
        this.titulo = titulo;
        this.tamaño = tamaño;
    }

    /**
     *
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     *
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     */
    public void display() {
        System.out.println(this.toString());
    }
}