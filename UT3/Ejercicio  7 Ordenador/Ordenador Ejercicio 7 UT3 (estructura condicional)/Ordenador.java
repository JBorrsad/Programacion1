
/**
 * Write a description of class Ordenador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ordenador
{
    private int maxMemoria;
    private int memoriaInstalada;
    
    public Ordenador(int memMax){
        if(memMax > 0){
        maxMemoria = memMax;
    }
        else{
            maxMemoria = 1024;
        }
        //maxMemoria = memMAX;
        memoriaInstalada = 0;
    }
    public int getMaxMemoria(){
    return maxMemoria;
    }
    public int obtenerMemoriaDisponible(){
        return maxMemoria - memoriaInstalada;
    }
    public void vaciarMemoria(){
        memoriaInstalada = 0;
    }
    public boolean instalar256Mb(){
        if (obtenerMemoriaDisponible() >= 256)
        {
        memoriaInstalada = memoriaInstalada + 256;//memoriaInstalada += 256;
        return true;
    }
    else{
        System.out.println("ERROR: Memoria maxima alcanzada.");
        return false;
    }
}
     public boolean instalarMemoria(int memoriaNueva){
         if (memoriaInstalada + memoriaNueva <= maxMemoria)
        {
        memoriaInstalada = memoriaInstalada + memoriaNueva;
        return true;//memoriaInstalada += 256;
    }
    else{
        System.out.println("ERROR: Memoria maxima alcanzada.");
        return false;
    }
}
     public void printInformacion (){
        System.out.println("Este ordenador puede tener hasta " + maxMemoria + "Mb de memoria." + "Todavia es posible instalar" + obtenerMemoriaDisponible() + "Mb");
    }  
    
}
