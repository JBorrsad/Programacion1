/**
 *   clase DemoFiguras 
 *
 *
 */

import java.awt.*;

public class DemoFiguras {
    private GestorFiguras gestor;

    /**
     * Constructor de objetos de la clase DemoFiguras
     */
    public DemoFiguras() {
        gestor = new GestorFiguras();
    }

    public void testAdd() {
        gestor.addFigura(new Circulo(4, 4, Color.red, 5.2));
        gestor.addFigura(new Circulo(4, 4, Color.red, 5.2));
        gestor.addFigura(new Circulo(1, 6, Color.yellow, 2));
        gestor.addFigura(new Cuadrado(0, 0, Color.green, 2));
        gestor.addFigura(new Cuadrado(0, 0, Color.green, 2));
        gestor.addFigura(new Cuadrado(14, 14, Color.pink, 12));
        gestor.addFigura(new Triangulo(4, 4, Color.green, 7, 7, 7));
        gestor.addFigura(new Triangulo(14, 14, Color.blue, 3, 11, 10));
    }

    public void testEscribir() {
        gestor.listarFiguras();

    }

    public void testMayorArea() {
        Figura f = gestor.mayorArea();
        System.out.println("Figura de mayor area : " + f.getClass().getName()
                + "\n" + String.format("%6.2f", f.calcularArea()));

    }

    public void testOrdenarPorArea() {
        gestor.ordenarPorArea();

    }

    public void testOrdenarPorPerimetro() {

        //gestor.ordenarPorPerimetro();

    }

    public static void main(String[] args) {
        DemoFiguras demo = new DemoFiguras();
        demo.testAdd();
        demo.testEscribir();
        demo.testMayorArea();
        // System.out.println("\nDespués de ordenar por área");
        // demo.testOrdenarPorArea();
        // System.out.println("\n------------------------");
        // System.out.println("\nDespués de ordenar por perímetro");
        // demo.testOrdenarPorPerimetro();

        separador();
        Color c = Color.GREEN;
        demo.testBorrarDeColor(c);
        System.out.println("\nDespués de borrar las de color " + c);
        demo.testEscribir();
        separador();


        Figura f = new Circulo(4, 4, Color.RED, 5.2);
        demo.testBorrarIgualesA(f);
        System.out.println(
                "\nDespués de borrar la figura " + f.toString() + "\n");
        separador();
        demo.testEscribir();

    }

    private void testBorrarIgualesA(Figura f) {
        gestor.borrarIguales(f);
    }

    private void testBorrarDeColor(Color c) {
        gestor.borrarDeColor(c);
    }
    private static void separador(){
        System.out.println("*************************************");
    }
}
