import java.util.Objects;

public class Liga {

    private final int maxEquipos = 20;
    private static String pais;
    private static Equipo[] listaEquipos ;

    public Liga(String pais) {
        this.pais = pais;
        listaEquipos= new Equipo[maxEquipos];
    }

    public void mostrarEquipos() {
        for (int i = 0; i < maxEquipos; i++) {
            if (listaEquipos[i] != null) {
                System.out.println(listaEquipos[i].getNombre()+"     "+listaEquipos[i].getCiudad()+"     "+listaEquipos[i].getNumJugadores());
            }
        }
    }

    public int getNumEquipos() {
        return (listaEquipos.length - 1);

    }

    public Equipo getEquipo(String nombre) {
        for (int i = 0; i < maxEquipos; i++) {
            if (listaEquipos[i] != null && (Objects.equals(listaEquipos[i].getNombre(), nombre))) {
                return listaEquipos[i];
            }
        }
        System.out.println("No se encuentra el equipo");
        return null;

    }

    public String getPais(){
        return this.pais;
    }

    public void añadirEquipo(Equipo equipo){
        for (int i=0;i<maxEquipos;i++){
            if (listaEquipos[i]==null){
                listaEquipos[i]=equipo;
                break;
            }
            else System.out.println("liga llena, no caben mas equipos!!");
        }
    }



}



