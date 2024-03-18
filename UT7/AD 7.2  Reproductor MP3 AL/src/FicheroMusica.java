public class FicheroMusica extends Fichero {
    private int duracion;

    public FicheroMusica(String titulo, int tamaño, int duracion) {
        super(titulo, tamaño);
        this.duracion = duracion;
    }

    @Override
    public void display() {

        int m = (int) (duracion / 60);
        int s = (int) (duracion % 60);
        super.display();
        System.out.println(m + "minutos" + s + "segundos");
    }

}


