public class FicheroJPG extends FicheroImagen{
    private Compresion Compresion;


    public FicheroJPG(String titulo, int tamaño, Compresion compresion) {
        super(titulo, tamaño);
        Compresion = compresion;
    }
}