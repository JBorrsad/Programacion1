
/**
 * Write a description of class lineaPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linea {
    
    public Punto punto1;
    public Punto punto2;
    
    public Linea (){
        punto1 = new Punto (0, 0);
        punto2 = new Punto (0, 0);
    }
    
    public Linea (Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    public void moverDerecha(int distancia){
         int xFinal1 = punto1.getX() + distancia;
         int xFinal2 = punto2.getX() + distancia;
         
         this.punto1.setX(xFinal1);
         this.punto2.setX(xFinal1);
         
    }
    public void moverIzquierda(int distancia){
        int xFinal1 = punto1.getX() - distancia;
         int xFinal2 = punto2.getX() - distancia;
         
         this.punto1.setX(xFinal1);
         this.punto2.setX(xFinal1);
    }
    public void moverArriba(int distancia){
        int xFinal1 = punto1.getY() + distancia;
         int xFinal2 = punto2.getY() + distancia;
         
         this.punto1.setY(xFinal1);
         this.punto2.setY(xFinal1);
    }
    public void moverAbajo(int distancia){
        int xFinal1 = punto1.getY() - distancia;
         int xFinal2 = punto2.getY() - distancia;
         
         this.punto1.setY(xFinal1);
         this.punto2.setY(xFinal1);
    }
    public Punto getPunto1 (){
        return punto1;
    }
    public Punto getPunto2 (){
        return punto2;
    }
    public void setPunto1 (Punto punto1){
        this.punto1 = punto1;
    }
    public void setPunto2 (Punto punto2){
        this.punto2 = punto2;
    }
    public void printLinea(){
        System.out.println ("Punto 1 - Valor de x = " + punto1.getX());
        System.out.println ("Punto 1 - Valor de y = " + punto1.getY());
        System.out.println ("Punto 2 - Valor de x = " + punto2.getX());
        System.out.println ("Punto 2 - Valor de y = " + punto2.getY());
    }
    
    
    
    
    }
