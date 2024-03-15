import java.util.Random;

public class Mapa {
    private int[][] tablero;
    private Posicion posTesoro;

    public Mapa() {
        this.tablero = new int[10][10];
        generarTablero();
    }

    private void generarTablero() {

        for (int i = 0; i < 10; i++) {
            tablero[i][0] = 0;
        }


        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 9; j++) {
                tablero[i][j] = random.nextDouble() < 0.8 ? 0 : 1;
            }
        }


        int filaTesoro = random.nextInt(10);
        posTesoro = new Posicion();
        posTesoro.setCoordenadaFila(filaTesoro);
        posTesoro.setCoordenadaCol(9);
        tablero[posTesoro.getCoordenadaFila()][posTesoro.getCoordenadaCol()] = 2;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public Posicion getPosTesoro() {
        return posTesoro;
    }
}
