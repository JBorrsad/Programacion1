import java.awt.*;

import static java.lang.Math.sqrt;

public class Triangulo extends Figura {


    private int l1;
    private int l2;
    private int l3;


    public Triangulo(int x, int y, Color c, int lado) {
        super(x, y, c);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;

    }

    @Override
    public double getArea() {
        double s = (l1 + l2 + l3) / 2;
        return sqrt(s * (s - l1) * (s - l2) * (s - l3));
    }

    @Override
    public double getPerimetro() {
        return l1 + l2 + l3;
    }


    public String toString() {
return super.toString()+l1+l2+l3;

    }

}
