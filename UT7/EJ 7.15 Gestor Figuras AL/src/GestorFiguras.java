import java.lang.reflect.Array;
import java.util.ArrayList;

public  class GestorFiguras {

    private  Figura figura; // la colección de figuras

    ArrayList <Figura>gestor;


    public GestorFiguras() {
      gestor= new ArrayList<Figura>();
    }


    public void addFigura(Figura f) {
gestor.add(f);
    }

    /**
     *
     * Mostrar todas las figuras
     */
    public void listarFiguras() {

        for (int i = 0; i < gestor.size(); i++) {
            System.out.println(gestor.get(i).toString());
        }

    }

    /**
     *
     */
    private void listarFiguras(List<Figura> figuras) {

    }


    /**
     *
     *
     * @return la figura de mayor área
     */
    public Figura mayorArea() {

    }

    /**
     *
     * @param color el color de la figura a borrar
     *
     */
    public void borrarDeColor(Color color) {

    }

    /**
     *
     * @param  f la figura con la que comparar, se borrar
     *      las que son iguales a ella
     *
     */
    public void borrarIguales(Figura f) {

    }


}
