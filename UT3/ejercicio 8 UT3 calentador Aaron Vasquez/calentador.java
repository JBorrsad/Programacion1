
//Aaron Vasquez DAM 1ºB//

public class calentador
{
    public int temperatura;
    public int minimo;
    public int maximo;
    public int incremento;
    
    public calentador (int min, int max){
        minimo = min;
        maximo = max;
        incremento = 5;
       temperatura = 15;
    }
    
    public void calentar(){
        if (temperatura + incremento < maximo){
        temperatura = temperatura + incremento;
    }
         }
    public void enfriar(){
        if (temperatura + incremento > minimo){
        temperatura = temperatura - incremento;
    }
    }
    public int getTemperatura(){
        return temperatura;
        
    }
     public void setIncremento(int incr){
    if (incr >= 0 ){
         incremento = incr;
     }
       
    }
}
   