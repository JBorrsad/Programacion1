
/**
 *  Representa una dimensión
 *  
 *  @author - Aaron Vasquez
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }
    
    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        //CREAMOS UN OBJETO NUEVO TIPO DIMENSION QUE SERA COPIA DE UNO YA CREADO.
        return new Dimension(alto, ancho, largo);

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
            //ASI QUEDA MAS BONITO PROFE, EL 20 LINEAS Y 10 ALA DERECHA QUEDA FEO
            //AL AGRANDAR LA PANTALLA DONDE SE EJECUTAN LOS PRINT 
            //LA DERECHA SIEMPRE QUEDA MUCHO ESPACIO, MAS DE 10.
        return  "\t\t Alto: \t\t" + String.format("%.2f", this.alto) + " (cm)\n" +
            "\t\tAncho: \t\t" + String.format("%.2f", this.ancho) + " (cm)\n" +
            "\t\tLargo: \t\t" + String.format("%.2f", this.largo) + " (cm)";
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
