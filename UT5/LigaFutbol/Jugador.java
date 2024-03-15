import java.util.Scanner;
public class Jugador {
    Scanner posi=new Scanner(System.in);
    private String nombre = null;
    private String nacionalidad = null;
    private int edad= 0;
    private String posicion = null;
    private boolean lesionado = false;

    private static String POR="Portero";
    private static String DEF="Defensa";
    private static String CTC="Centrocampista";
    private static String DEL="Delantero";


        public Jugador (String nombre, String nacionalidad, int edad, String posicion){
            this.nombre=nombre;
            this.nacionalidad=nacionalidad;
            this.edad=edad;
            this.posicion=posicion;
            this.lesionado=false;
        }



        public String getNombre(){
            return nombre;
        }

        public String getNacionalidad(){
            return nacionalidad;
        }

        public int getEdad(){
            return edad;
        }

        public String getPosicion(){
            return posicion;
        }

        public boolean getLesionado(){
            return lesionado;
        }

        public  void lesionarse(){
            if (lesionado==false){
                    lesionado=true;
            }
        }

        public void recuperarse(){
            if (lesionado==true){
                lesionado=false;
            }
        }
//final
}
