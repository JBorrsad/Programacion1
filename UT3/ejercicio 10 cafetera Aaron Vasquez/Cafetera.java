
/**
 * Write a description of class Cafetera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cafetera
{
   int capacidadMaxima;
   int capacidadMinima;
   int cantidadActual;
   
   public Cafetera (){
       capacidadMaxima = 1000;
       capacidadMinima = 0;
       cantidadActual = 0;
   }
   public int getCapacidadMaxima(){
       return capacidadMaxima;
   }
   public void setCapacidadMaxima(int capacidadM){
    capacidadMaxima = capacidadM;
   }
   public int getcantidadActual (){
       return cantidadActual;
   }
   public void setcantidadActual (int cantidadA){
       cantidadActual = cantidadA;
   }
   public void llenarCafetera (){
       cantidadActual = capacidadMaxima;
   }
   public void servirTaza (int servir){
    if (servir <= cantidadActual){
     cantidadActual = cantidadActual - servir;
   }
   else if (servir > cantidadActual){
     
    cantidadActual = 0;
}
}
public void vaciarCafetera (){
    cantidadActual = 0;
}
public void agregarCafe (int masCafe){
    cantidadActual = cantidadActual + masCafe;
}
}
