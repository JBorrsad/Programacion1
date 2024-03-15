import java.util.Objects;

public class Equipo {
    private final int maxJugadores=22;
    private String nombre=null;
    private String ciudad=null;
    private Jugador[]listaJugadores=new Jugador[maxJugadores];


    public Equipo(String nombre, String ciudad){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.listaJugadores=listaJugadores;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCiudad(){
        return ciudad;
    }
    public int getNumJugadores(){
    int o=0;
        for (int i=0;i<maxJugadores;i++){
            if(listaJugadores[i]!=null){
                o++;}
        }
        return o;
    }



    public void mostrarJugadores(){
        for (int i=0;i<maxJugadores;i++){
            if(listaJugadores[i]!=null){
            System.out.println(listaJugadores[i].getNombre()+"      "+listaJugadores[i].getPosicion()+"     "+listaJugadores[i].getEdad() +"        "+listaJugadores[i].getNacionalidad()+"     "+listaJugadores[i].getLesionado());}
        }
    }

    public void adquirirJugador(Jugador jugador){
        for (int i=0;i<maxJugadores;i++){
            if (listaJugadores[i]==null){
                listaJugadores[i]=jugador;
                break;
            }
            else System.out.println("Equipo lleno");
        }
    }

    public void venderJugador(String nombre){
        for (int i=0;i<maxJugadores;i++) {
            if (Objects.equals(listaJugadores[i],nombre)) {
                borrar(i);
            }
        }
    }


    public void borrar(int p) {
        int pos=maxJugadores;


        if (p >= 0 && p < pos) {

            for (int i = p + 1; i < pos; i++) {
                listaJugadores[i - 1] = listaJugadores[i];
            }
            pos--;
        }
    }
}
