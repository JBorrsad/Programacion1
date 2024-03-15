
/**
 *  Un objeto de esta clase representa un envío de varios paquetes,
 *  máximo tres
 *  
 * 
 * @author -  Aaron Vasquez
 *  
 */
public class Envio
{
    private final double PRECIO_KILO = 2.2;  // precio coste envío Kg. en euros
    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    /**
     * Constructor  
     * Inicializa los paquetes a null (inicialmente
     * el envío no tiene paquetes)
     */
    public Envio()    {
        this.paquete1 = null;
        this.paquete2 = null;
        this.paquete3 = null;

    }

    /**
     * accesor para el paquete1
     */
    public Paquete getPaquete1() {
        return paquete1;

    }

    /**
     * accesor para el paquete2
     */
    public Paquete getPaquete2() {
        return paquete2;

    }

    /**
     * accesor para el paquete3
     */
    public Paquete getPaquete3() {
        return paquete3;

    }

    /**
     * Devuelve el nº de paquetes en el envío
     * (dependerá de cuántos paquetes estén a null)
     */
    public int getNumeroPaquetes(){
        //AÑADIRA +1 EN NUMEROPAQUETES CUANDO HAYA UN PAQUETE NOT NULL.
        int numeroPaquetes =  0;
        if (paquete1 != null) {
            numeroPaquetes++;
        }

        if (paquete2 != null) {
            numeroPaquetes++;
        }

        if (paquete3 != null) {
            numeroPaquetes++;
        }
        return numeroPaquetes;
    }

    /**
     * Devuelve true si el envío está completo, false en otro caso
     * (tiene exactamente 3 paquetes)
     */
    public boolean envioCompleto() {
       //SI HAY 3 PAQUETES DARA TRUE, SI HAY MENOS DARA FALSE.
        return getNumeroPaquetes() == 3;
        }
        
    /**
     * Se añade un nuevo paquete al envío
     * Si el envío está completo se muestra
     * el mensaje "No se admiten más paquetes en el envío"
     * Si no está completo se añade el paquete al envío teniendo en cuenta
     * si se añade como primero, segundo o tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete) {
       //SOLO AÑADIRA  EL PAQUETE SI NO ESTAN COMPLETOS, ES DECIR SI NO HAY YA 3 PAQUETES, SI ESTA LLENO DE PAQUETES ESTE TE DIRA LO QUE TENEMOS EN EL SYSTEM OUT PRINTLN.
        if (getNumeroPaquetes() < 3) { // Solo añadir paquete si no está completo
            if (paquete1 == null) {
                this.paquete1 = paquete;
            } else if (paquete2 == null) {
                this.paquete2 = paquete;
            } else if (paquete3 == null) {
                this.paquete3 = paquete;
            }
        } else {
            System.out.println("No se admiten más paquetes en el envío");
        }
    }

    /**
     * Calcula y devuelve el coste total del envío
     * 
     * Para calcular el coste:
     *      - se obtiene el peso facturable de cada paquete 
     *      - se suman los pesos facturables de todos los paquetes del envío
     *      - se calcula el coste en euros según el precio del Kg 
     *      (cada Kg. no completo se cobra entero, 5.8 Kg. se cobran como 6, 5.3 Kg. se cobran como 6)
     *     
     *  
     */
    public double calcularCosteTotalEnvio() {
        //NOS DARA EL PRECIO TOTAL DE TODOS LOS PAQUETES METIDOS,REDONDEARA PARA ARRIBA EL PESO QUE TENGA EN DECIMALES, Y LUEGO MULTIPLICARA TODO EL PESO POR EL PRECIO KILO.
        int pesoFacturable123 = 0;
        if(paquete1 != null){
        pesoFacturable123 += (int)Math.ceil(paquete1.calcularPesoFacturable());
    }
        if (paquete2 != null)
        {pesoFacturable123 += (int)Math.ceil(paquete2.calcularPesoFacturable());
        }
        if(paquete3 != null) 
        pesoFacturable123 += (int)Math.ceil(paquete3.calcularPesoFacturable());
        double precioTotal123 = pesoFacturable123 * this.PRECIO_KILO;
       return precioTotal123;
    }

    /**
     * Representación textual del envío
     * con el formato exacto indicado
     * (leer enunciado)
     */
    public String toString() {
       //MUESTRA TODAS LAS ESTADISTICAS DE LOS PAQUETE 1, 2 Y 3.
        String resultadoToString = "Nº de paquetes: " + getNumeroPaquetes() + "\n";
           if (paquete1 != null){
            resultadoToString += "Descripcion del  paquete \n" +
            "\t\t     Alto:" + String.format("%10.2f", paquete1.getDimension().getAlto()) + " (cm)\n" +
            "\t\t    Ancho:" + String.format("%10.2f", paquete1.getDimension().getAncho()) + " (cm)\n" +
            "\t\t    Largo:" + String.format("%10.2f", paquete1.getDimension().getLargo()) + " (cm)\n" +
            "\t        Peso real:" + String.format("%10.2f", paquete1.getPeso()) + " (Kg)\n" +
            "\t          Volumen:" + String.format("%10.2f", paquete1.calcularVolumen()) + " (cm3)\n" +
            "\t Peso volumetrico:" + String.format("%10.2f", paquete1.calcularPesoVolumetrico()) + " (Kg)\n" +
            "\n";
        }
            if (paquete2 != null){
            resultadoToString += "Descripcion del  paquete \n" +
            "\t\t     Alto:" + String.format("%10.2f", paquete2.getDimension().getAlto()) + " (cm)\n" +
            "\t\t    Ancho:" + String.format("%10.2f", paquete2.getDimension().getAncho()) + " (cm)\n" +
            "\t\t    Largo:" + String.format("%10.2f", paquete2.getDimension().getLargo()) + " (cm)\n" +
            "\t        Peso real:" + String.format("%10.2f", paquete2.getPeso()) + " (Kg)\n" +
            "\t          Volumen:" + String.format("%10.2f", paquete2.calcularVolumen()) + " (cm3)\n" +
            "\t Peso volumetrico:" + String.format("%10.2f", paquete2.calcularPesoVolumetrico()) + " (Kg)\n" +
            "\n";
        }
            if (paquete3 != null){
            resultadoToString += "Descripcion del  paquete \n" +
            "\t\t     Alto:" + String.format("%10.2f", paquete3.getDimension().getAlto()) + " (cm)\n" +
            "\t\t    Ancho:" + String.format("%10.2f", paquete3.getDimension().getAncho()) + " (cm)\n" +
            "\t\t    Largo:" + String.format("%10.2f", paquete3.getDimension().getLargo()) + " (cm)\n" +
            "\t        Peso real:" + String.format("%10.2f", paquete3.getPeso()) + " (Kg)\n" +
            "\t          Volumen:" + String.format("%10.2f", paquete3.calcularVolumen()) + " (cm3)\n" +
            "\t Peso volumetrico:" + String.format("%10.2f", paquete3.calcularPesoVolumetrico()) + " (Kg)\n" +
            "\n";
        }
            resultadoToString += "\tCoste total envio:" + String.format("%10.2f", calcularCosteTotalEnvio()) + "€";
            return resultadoToString;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Envio
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
