package modelo;

import java.awt.*;

public class CocheFantastico extends Coche{

    /**
     * Constructor
     *
     * @param conductor
     * @param modelo
     * @param color
     * @param posicion
     */
    public CocheFantastico(String conductor, String modelo, String color, Point posicion) {
        super(conductor, modelo, color, posicion);
    }



    @Override
    public void avanza() {

    }

    public void volar(){

        System.out.println("zebzbzbbezbzebbeb");
    }


public static void main(String[] args) {

    Coche miCoche= new CocheFantastico("1","2","rojo",new Point(1,2));


    miCoche.volar();
}}

