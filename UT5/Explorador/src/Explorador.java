import java.util.Random;
//moha hace cambios
public class Explorador {
    private static final int ARRIBA = 1;
    private static final int ABAJO = 2;
    private static final int IZQUIERDA = 3;
    private static final int DERECHA = 4;

    private String nombre;
    private Posicion posicionActual;

    public Explorador(String nombre) {
        this.nombre = nombre;
        Random random = new Random();
        this.posicionActual = new Posicion();
        this.posicionActual.setCoordenadaFila(random.nextInt(10));
        this.posicionActual.setCoordenadaCol(0);
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void moverse(int direccion) {
        switch (direccion) {
            case ARRIBA:
                if (posicionActual.getCoordenadaFila() > 0) {
                    posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila() - 1);
                }
                break;
            case ABAJO:
                if (posicionActual.getCoordenadaFila() < 9) {
                    posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila() + 1);
                }
                break;
            case IZQUIERDA:
                if (posicionActual.getCoordenadaCol() > 0) {
                    posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol() - 1);
                }
                break;
            case DERECHA:
                if (posicionActual.getCoordenadaCol() < 9) {
                    posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol() + 1);
                }
                break;
            default:
                System.out.println("Dirección no válida.");
        }
    }

    public int explorar(Mapa mapa) {
        int numCasillasConTrampas = 0;

        if (checkPosicion(mapa, posicionActual.getCoordenadaFila() - 1, posicionActual.getCoordenadaCol())) { // Arriba
            numCasillasConTrampas++;
        }
        if (checkPosicion(mapa, posicionActual.getCoordenadaFila() + 1, posicionActual.getCoordenadaCol())) { // Abajo
            numCasillasConTrampas++;
        }
        if (checkPosicion(mapa, posicionActual.getCoordenadaFila(), posicionActual.getCoordenadaCol() - 1)) { // Izquierda
            numCasillasConTrampas++;
        }
        if (checkPosicion(mapa, posicionActual.getCoordenadaFila(), posicionActual.getCoordenadaCol() + 1)) { // Derecha
            numCasillasConTrampas++;
        }
        return numCasillasConTrampas;
    }

    public int checkPosicion(Mapa mapa) {
        int fila = posicionActual.getCoordenadaFila();
        int columna = posicionActual.getCoordenadaCol();

        if (mapa.getTablero()[fila][columna] == 1) {
            return 1;
        } else if (mapa.getTablero()[fila][columna] == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    private boolean checkPosicion(Mapa mapa, int fila, int columna) {
        return fila >= 0 && fila < 10 && columna >= 0 && columna < 10;
    }
}
