import java.util.*;
/**
 * La clase Secuencia almacena un serie de 
 * números enteros ordenados.
 */
public class Secuencia {
    private ArrayList<Integer> lista;
    /**
     * Construye una lista a partir de la colección 
     * recibida como parámetro
     */        
    public Secuencia(ArrayList<Integer>otra)
    {
         lista = otra;
    }
    /**
     * accesor para la secuencia ArrayList almacenada
     * devuelve  una copia, no el propio original. Para ello
     * crea una nueva colección de enteros y vuelve a utilizar addAll()
     */

    public ArrayList<Integer> getSecuencia()
    {
        ArrayList<Integer> copialista = new ArrayList<>(lista);
        return copialista;
    }
    /**
     * Obtiene la fusión (la unión) de dos listas 
     * de números ordenadas, la represetnada por el atributo lista y 
     * la representada por el parámetro otra
     * 
     */
    public ArrayList<Integer> fusionarCon(ArrayList<Integer> otra)
    {
        lista.addAll(otra);
        return lista;
    }
    /**
     * Obtiene la intersección de lista y el parámetro otra. La  intersección 
     * contiene los elementos comunes y no repetidos de ambas (en orden)
     */
    public  ArrayList<Integer> interseccionCon( ArrayList<Integer> otra)
    {
        //Podria haber usado HashSet para no repetir los elementos del metodo y que sea mas eficiente.
        ArrayList<Integer>interseccion = new ArrayList<>();
        for (Integer elemento : lista){
            if(otra.contains(elemento) && !interseccion.contains(elemento)){
                interseccion.add(elemento);
            }
        }
        return interseccion;
    }
    /**
     *  Elimina los duplicados de una lista
     *
     */
    private ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> lista)
    {
        HashSet<Integer>eliminarDupli = new HashSet<>();
        eliminarDupli.addAll(lista);
        return new ArrayList<>(eliminarDupli);
    }
    /**
     * Representación textual de la secuencia guardada
     * por el objeto actual
     */
    public String toString()
    {
        return lista.toString();
    }
}
