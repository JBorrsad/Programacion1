/**
 *
 *
 */
public abstract class Fichero {
    private String titulo;
    private int tamano;

    /**
     *
     */
    public Fichero(String titulo, int tamano) {
        this.titulo = titulo;
        this.tamano = tamano;
    }

    /**
     *
     */
    public int getTamaño() {
        return tamano;
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
        System.out.println(this.getClass().getSimpleName() +"\n"+"Titulo:"+titulo+"\n"+"Tamaño:"+  tamano);
    }
}