import java.util.Scanner;
public class Explorador {
    private String nombre;
    private Posicion posicionActual;

    public Explorador(String nombr) {
        nombre = nombr;
        int inicio = (int) (Math.random() * 10 + 0);
        posicionActual = new Posicion(0, inicio);
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicionActua) {
        posicionActual = posicionActua;
    }

    public int Explorar(Mapa mapa) {
        int trampas = 0;
        if (posicionActual.getCoordenadaFila() +1 <= 9 && mapa.getTablero()[posicionActual.getCoordenadaFila() + 1][posicionActual.getCoordenadaCol()] == 1) {
            trampas++;
        } else if (posicionActual.getCoordenadaFila() -1 >= 0 && mapa.getTablero()[posicionActual.getCoordenadaFila()-1][posicionActual.getCoordenadaCol()] == 1) {
            trampas++;
        } else if (posicionActual.getCoordenadaCol() +1 <= 9 && mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol() + 1] == 1) {
            trampas++;
        } else if (posicionActual.getCoordenadaCol() -1 >= 0 && mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol() - 1] == 1) {
            trampas++;
        }
        return trampas;
    }
    public int checkPosicion(Mapa mapa) {
        int posicion = 0;
        if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()] == 0) {
            System.out.println( getNombre() + " no pasa nada. Sigue jugando…");
        } else if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()] == 1) {
            posicion = 1;
            System.out.println(getNombre() + " ha caido en una trampa.\n" + "Fin del juego.");
        } else {
            posicion = 2;
            System.out.println(getNombre() + " ha encontrado el tesoro.\n" + "ENHORABUENA.\n" + "Fin del juego.");
        }
        return posicion;
    }
    public void Moverse(int direccion) {
            switch (direccion) {
                case 1:
                    if (posicionActual.getCoordenadaFila() -1 >= 0) {
                        posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila()-1);
                    } else {
                        System.out.println("Estas saliendo del tablero, sera mejor que pulses otra opcion");
                    }
                    break;
                case 2:
                    if (posicionActual.getCoordenadaFila() +1 <= 9) {
                        posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila()+1);
                    } else{
                        System.out.println("Estas saliendo del tablero, sera mejor que pulses otra opcion");
                    }
                    break;
                case 3:
                    if (posicionActual.getCoordenadaCol() -1 >= 0) {
                        posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol()-1);
                    } else{
                        System.out.println("Estas saliendo del tablero, sera mejor que pulses otra opcion");
                    }
                    break;
                case 4:
                    if (posicionActual.getCoordenadaCol() +1 <= 9) {
                        posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol()+1);
                    } else{
                        System.out.println("Estas saliendo del tablero, sera mejor que pulses otra opcion");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
    }
}
