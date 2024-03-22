import java.awt.*;

public class Cuadrado extends Figura{

    private int lado;


    public Cuadrado(int x, int y, Color c,int lado) {
        super(x, y, c);
        this.lado=lado;
    }

    public int getLado(){
        return this.lado;}

    @Override
    public String toString() {
        return super.toString()+this.lado;
    }


    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return 4*lado;
    }
}
