
/**
 * Write a description of class Carpa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carpa
{
    // instance variables - replace the example below with your own
    private final char CERVEZA = 'C';
    private final char KALIMOTXO = 'K';
    private final char CUBATA = 'U';
    private final double PRECIO_VASO_CERVEZA = 2;
    private final double PRECIO_VASO_KALIMOTXO = 2.5;
    private final double PRECIO_VASO_CUBATA = 4.5;
    private final double IVA = 0.1;
    private final double DESCUENTO_MEDIODIA = 0.2;
    private String lugar;
    private int totalCervezas;
    private int totalKalimotxos;
    private int totalCubatas;
    private double totalRecaudado;
    private int numeroCliente;
    private int numeroConsumicionesGratis;
    /**
     * Constructor for objects of class Carpa
     */
    public Carpa(String miLugar)
    {
        // initialise instance variables
        lugar = miLugar;
        totalCervezas = 0;
        totalKalimotxos = 0;
        totalCubatas = 0;
        totalRecaudado = 0;
        numeroCliente = 0;
        numeroConsumicionesGratis = 0;
        }
    
        public String getLugar () {
            return lugar;
        }
        
        public void setLugar (String miLugar) {
            lugar = miLugar;
        }
        
        public void servirPedido (char tipo, int unidades, boolean katxi, int hora, int minutos) {
            
            double precioPedido = 0;
            double multiplicadorKatxi = 0;
            double precioPedidoIVA;
            double precioFinal = 0;
            int numeroAleatorio;
            String nombreBebida = "";
            
            switch (tipo){
                case CERVEZA:
                    precioPedido = PRECIO_VASO_CERVEZA * unidades;
                    multiplicadorKatxi = 3;
                    totalCervezas = totalCervezas + unidades;
                    nombreBebida = "CERVEZA";
                    break;
                case KALIMOTXO:
                    precioPedido = PRECIO_VASO_KALIMOTXO * unidades;
                    multiplicadorKatxi = 2;
                    totalKalimotxos = totalKalimotxos + unidades;
                    nombreBebida = "KALIMOTXO";
                    break;
                case CUBATA:
                    precioPedido = PRECIO_VASO_CUBATA * unidades;
                    multiplicadorKatxi = 1.4;
                    totalCubatas = totalCubatas + unidades;
                    nombreBebida = "CUBATA";
                    break;
            }
            
            if (katxi){
                //precioPedido = precioPedido * multiplicadorKatxi;
                precioPedido *= multiplicadorKatxi;
            }
                precioPedidoIVA = precioPedido + precioPedido * IVA;
                
                if(precioPedidoIVA > 15 && hora >= 15 && hora < 18){
                precioFinal = precioFinal * (1 - DESCUENTO_MEDIODIA);
                //precioFinal *= (1 - DESCUENTO_MEDIODIA);
                } else {
                    precioFinal = precioPedidoIVA;
                } 
                
                totalRecaudado += precioFinal;
                numeroCliente++;
                
                System.out.println ("Ticket del cliente nº " + numeroCliente);
                System.out.println ("************");
                System.out.println ("Hora del pedido: " + hora + " y " + minutos);
                System.out.println ("Nº de bebidas solicitadas " + unidades);
                System.out.println ("Tipo de bebida " + nombreBebida);
                System.out.println ("¿Tamaño Katxi? " + katxi);
                System.out.println ("Precio unidad " + precioPedido / unidades);
                System.out.println ("Importa sin IVA: " + precioPedido);
                System.out.println ("Importe con IVA: " + precioPedidoIVA);
                System.out.println ("Descuento mediodia: " + (precioFinal - precioPedidoIVA));
                System.out.println ("Importe final despues de aplicar dto: " + precioFinal + "€");
                System.out.println ("");
                System.out.println ("");
                
                numeroAleatorio = (int)Math.random()*1000;
                
                if (numeroAleatorio % 2 == 1){
                    System.out.println("***** Enhorabuena!!! Tiene una consumición gratis******");
                    System.out.println("Su boleto era " + numeroAleatorio);
                    numeroConsumicionesGratis++;
                }
           System.out.println ("Hasta el momento......" );
                System.out.println ("Total recaudado: " + precioFinal  );
                System.out.println ("Consumiciones gratis: " + numeroConsumicionesGratis  );
                
        }
        public String obtenerBebidaMasVendida(){
            String nombreBebidaMasVendida;
            if (totalCervezas >= totalKalimotxos && totalCervezas >= totalCubatas){
                nombreBebidaMasVendida = "CERVEZA";
            } else if (totalKalimotxos >= totalCervezas && totalKalimotxos >= totalCubatas){
                nombreBebidaMasVendida = "KALIMOTXO";
            } else {
                nombreBebidaMasVendida = "CUBATA";
            }
            return nombreBebidaMasVendida;
        }
}
