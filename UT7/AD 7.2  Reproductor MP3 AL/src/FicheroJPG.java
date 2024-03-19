public class FicheroJPG extends FicheroImagen{
    private Compresion compresion;


    public FicheroJPG(String titulo, int tamano, Compresion compresion) {
        super(titulo, tamano);
        this.compresion = compresion;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("\nCompresion:"+ compresion);
    }



}