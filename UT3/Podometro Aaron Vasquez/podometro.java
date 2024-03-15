
/**
 * Write a description of class podometro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class podometro
{
    private final char HOMBRE = 'H';
    private final char MUJER = 'M';
    private final double ZANCADA_HOMBRE = 0.45;
    private final double ZANCADA_MUJER = 0.41;
    private final char SABADO = '6';
    private final char DOMINGO = '7';
    public String marca;
    public double altura;
    public char sexo;
    public double longitudZancada;
    public int totalPasosSabado;
    public int totalPasosDomingo;
    public double totalDistanciaSemana;
    public double totalDistanciaFinSemana;
    public int tiempo;
    public int caminatasNoche;
    public int totalPasosLaborables;

    public podometro(String marc){
        marca = marc; 
        sexo = MUJER;
        altura = 0;
        longitudZancada = 0;
        totalPasosSabado = 0;
        totalPasosDomingo = 0;
        totalDistanciaSemana = 0;
        totalDistanciaFinSemana = 0;
        tiempo = 0;
        caminatasNoche = 0;
        totalPasosLaborables = 0;
    }
        
        public String getMarca(){
            return marca;
    }
    public void configurar (double queAltura, char queSexo) {
           if (queSexo == 'H'){
               longitudZancada = Math.floor(queAltura * ZANCADA_HOMBRE);
            } else {
                   longitudZancada = Math.ceil(queAltura * ZANCADA_MUJER);
                }
             
            }
        public void registrarCaminata (int pasos, int dia, int horaInicio, int horaFin){
          
    String nombreDia;
    
    switch (dia){
    case 1: nombreDia = "lunes";
    break;
    case 2: nombreDia = "martes";
    break;
    case 3: nombreDia = "miercoles";
    break;
    case 4: nombreDia = "jueves";
    break;
    case 5: nombreDia = "viernes";
    break;
    case 6: nombreDia = "sabado";
    break;
    case 7: nombreDia = "domingo";
    break;
    default: nombreDia = "ERROR";
    break;
}
    int minutosInicio = ((horaInicio / 100) *60 ) + (horaInicio % 100);
    int minutosFinal = ((horaFin/100) *60 ) + (horaFin % 100);
    
    tiempo = (minutosFinal - minutosInicio);
    
    }

 public void printConfiguración(){
  System.out.println("Configuracion del Podometro");
  System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Longitud De Zancada: " + longitudZancada);

}


public String diaMayorNumeroPasos(){
    if (totalPasosLaborables > totalPasosSabado && totalPasosLaborables > totalPasosDomingo) { 
        return "LABORABLES";
    }
     else if (totalPasosSabado > totalPasosLaborables && totalPasosSabado > totalPasosDomingo){
        return "SABADO";
    }
    else if  (totalPasosDomingo > totalPasosLaborables && totalPasosDomingo > totalPasosSabado){
        return "DOMINGO";
    }
     else {
        return "EMPATE";
    }
}
public void printEstadisticas(){
    
    System.out.println("Estadisticas");
    System.out.println("Distancia recorrida toda la semana: " + totalDistanciaSemana);
    System.out.println("Distancia recorrida fin de semana: " + totalDistanciaFinSemana);
    System.out.println("Nº pasos dias laborables: " + totalPasosLaborables);
    System.out.println("Nº pasos SABADO: "+ totalPasosSabado);
    System.out.println("Nº pasos DOMINGO: " + totalPasosDomingo);
    System.out.println("Nº de caminatas realizadas a partir de las 21h: " + caminatasNoche);
    System.out.println("Tiempo total caminando en la semana: " + (tiempo ) +"Horas y" + (tiempo) + "Minutos");
    System.out.println("Dia/s con mas pasos caminados: " +  diaMayorNumeroPasos());
}
                      
    public void reset(){
        sexo = MUJER;
        altura = 0;
        longitudZancada = 0;
        totalPasosSabado = 0;
        totalPasosDomingo = 0;
        totalDistanciaSemana = 0;
        totalDistanciaFinSemana = 0;
        tiempo = 0;
        caminatasNoche = 0;
        totalPasosLaborables = 0;
     
    }
}



