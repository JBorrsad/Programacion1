package modelo;
import java.awt.*;
import java.util.*;


public class Taxi extends Coche{

private int numplazas;

    public Taxi(String conductor,String modelo, String color, Point posicion, int numplazas) {
        super(conductor,modelo, color, posicion);
        numplazas=this.numplazas;

    }


    public void avanza() {
        if (Math.random()>=0.33) {
            getPosicion().translate(35,0);
        }
        else getPosicion().translate(15,0);
    }





    public String toString(){
        return super.toString() + "\n" + "Numero de Plazas:"+numplazas;
    }


}