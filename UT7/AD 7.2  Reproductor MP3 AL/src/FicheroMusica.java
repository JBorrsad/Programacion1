import java.lang.Math;


public class FicheroMusica extends Fichero {
    private int duracion;

    public FicheroMusica(String titulo, int tamano, int duracion) {
        super(titulo, tamano);
        this.duracion = duracion;
    }

    @Override
    public void display() {

        int m =  duracion / 60;
        int s = duracion % 60;
        super.display();
        System.out.println("Duracion:"+m+ "minutos" +s+ "segundos");
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

