public class Mapa {
    private int [][] tablero;
    private Posicion posTesoro;
    public Mapa(){
        tablero = new int [10][10];
        int filaRandom = (int)(Math.random() *10 + 0);
        tablero[filaRandom][9] = 2;
        for(int x=0 ; x < tablero.length ; x++){
            for (int y=0 ; y < tablero[x].length ; y++){
                int probabilidad = (int)(Math.random() *100 + 1);
                if(probabilidad <= 80 && tablero[x][y] != 2){
                    tablero[x][y] = 0;
                }
                else if (probabilidad > 80 && tablero[x][y] != 2){
                    tablero[x][y] = 1;
                }
            }
        }
    }
    public int [][] getTablero(){
        return tablero;
    }
    public Posicion getPosTesoro() {
        return posTesoro;
    }
}