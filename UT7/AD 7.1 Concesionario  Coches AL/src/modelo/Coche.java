package modelo;

import java.awt.*;

import java.util.*;

/**
 * Modela un cohe
 */

public abstract class Coche {
    private String conductor;
    private String modelo;
    private String color;
    private Point posicion;

    /**
     * Constructor
     */

    public Coche(String conductor, String modelo, String color,
                 Point posicion) {
        this.conductor = conductor;
        this.modelo = modelo;
        this.color = color;
        this.posicion = posicion;
    }

    /**
     * accesor para el conductor
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * accesor para el modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * accesor para el color
     */
    public String getColor() {
        return color;
    }

    /**
     * accesor para la posición
     */
    public Point getPosicion() {
        return posicion;
    }

    /**
     * mutador para el conductor
     */
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    /**
     * mutador para el modelo
     */
    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    /**
     * mutador para el color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * mutador para la posición
     */
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    /**
     * Representación textual del coche
     */
    @Override
    public String toString() {

        return
                this.getClass().getSimpleName()+ "\n"+
                "Conductor: "+ this.getConductor() +"\n"+
                "Modelo: "+  this.getModelo().toString() +"\n"+
                "Color: "+  this.getColor().toString() +"\n"+
                "Posición: "+  this.getPosicion().toString() ;}

    @Override
    public int hashCode() {
        return conductor.hashCode() + modelo.hashCode() + color.hashCode();

    }


    public boolean equals(Coche c) {

        if (c==null || this.getClass() !=c.getClass()){
            return false;
        }

        if (this==c) {
            return true;
        }
        else {

        return this.modelo.equals(c.getModelo()) && this.color.equals(c.getColor()) &&
                this.conductor.equals(c.getConductor()) && this.posicion == (c.getPosicion());
        }
    }




    public abstract void avanza() ;


     

}