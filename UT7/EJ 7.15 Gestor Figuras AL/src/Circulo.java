import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.util.Iterator;

/**
 * Modela un círculo de radio determinado
 *
 *
 */

public class Circulo extends Figura{

private double radio;

    public Circulo(int x, int y, Color color,int radio) {
        super(x, y, color);
        Point centro= new Point(x,y);
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return (Math.pow(Math.PI,2))*radio;
    }

    public double getPerimetro(){
return (Math.PI*radio);
    }

}
