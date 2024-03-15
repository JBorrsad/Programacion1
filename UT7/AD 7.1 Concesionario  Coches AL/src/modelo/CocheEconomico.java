package modelo;
import java.awt.*;
import java.util.*;


public class CocheEconomico  extends Coche{



    public CocheEconomico(String conductor,String modelo, String color, Point posicion) {
        super(conductor,modelo, color, posicion);

    }

    public void avanza() {
        if (Math.random()>=0.5) {
            getPosicion().translate(20,0);
        }
        else getPosicion().translate(25,0);
    }




}