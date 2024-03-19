import java.util.*;


public class ReproductorMP3 {

    private List<Fichero> ficheros;
    private int capacidad;  //en bytes
    private int tamActual;

    /**
     * Constructor de la clase ReproductorMP3
     */
    public ReproductorMP3(int bytes) {
       ficheros = new ArrayList<Fichero>();
        capacidad = bytes;

        //ficheros gratis
        ficheros.add(new FicheroMusica("Cancion 1", 3155, 166));
        ficheros.add(new FicheroMusica("Cancion 2", 2029, 187));
        tamActual = 3155 + 2029;
    }

    /**
     *  a?ade un fichero al MP3 actualizando el tama?o.
     *  Antes de a?adirlo se comprueba si hay espacio en el MP3 y no hay un
     *  fichero igual.
     */
    public void addFichero(Fichero f) {

    }

    /**
     *  accesor para la capacidad del MP3
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     *  borra todos los ficheros y pone el tama?o actual a 0
     */
    public void reset() {

    }

    /**
     *  muestra los títulos de los ficheros de m?sica
     *  que hay en el MP3. Al final se muestra el total de horas, minutos y
     *  segundos de m?sica que hay
     */
    public void mostrarCanciones() {

    }

    /**
     *  dado un t?tulo, borra los ficheros de imagen
     *  con este t?tulo.
     *  Devuelve true o false dependiendo de si se ha borrado alguno o no
     */
    public boolean borrarFicheroImagen(String titulo) {

    }

    /**
     *  ordena aleatoriamente la lista de ficheros
     */
    public void reordenar() {

    }

    /**
     *  ordena la lista de ficheros por tama?o
     */
    public void ordenarPorTama?

    o() {


    }

    /**
     *  ordena la lista de ficheros por t?tulo de fichero
     *
     */
    public void ordenarPorTitulo() {

    }

    /**
     * ordena la lista de ficheros por tamaño de fichero
     *
     */
    public void ordenarPorTamaño() {

    }

    /**
     * ordena la lista de ficheros por título descendente
     * (orden inverso al orden  natural)
     *
     */
    public void ordenarPorTituloDescendente() {

    }

    /**
     * ordena la lista de ficheros por tamaño descendente
     *
     */
    public void ordenarPorTamañoDescendente() {

    }

    /**
     * Muestra todos los ficheros del MP3
     */
    public void mostrarReproductor() {

    }
}
