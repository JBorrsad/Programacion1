package modelo;
import java.awt.*;
import java.util.*;


public class CocheDeportivo  extends Coche{



    public CocheDeportivo(String conductor,String modelo, String color, Point posicion) {
        super(conductor,modelo, color, new Point(0,200));


    }


    public void avanza() {
if (Math.random()>=0.7) {
getPosicion().translate(50,0);
}
else getPosicion().translate(30,0);
    }



}
      
