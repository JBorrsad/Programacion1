import java.util.Scanner;

public class Main {
    private static final int INSERTAREQUIPO= 1;
    private static final int INSERTARJUGADOR = 2;
    private static final int VEREQUIPOSLIGA= 3;
    private static final int VERJUGADORESEQUIPO = 4;
    private static final int VENDERJUGADOR = 5;
    private static final int SALIR=6;
    private static Scanner teclado;

    private static String POR="Portero";
    private static String DEF="Defensa";
    private static String CTC="Centrocampista";
    private static String DEL="Delantero";

    private static Liga miLiga;

    public static void main(String[] args) {
        System.out.println("Empiece creando una liga:");
        System.out.println("Inserta el pais de la liga:");
        teclado = new Scanner(System.in);
         miLiga = new Liga(teclado.nextLine());
         iniciar();
    }
        public static void iniciar()   {

            int opcion = menu();
            while (opcion != SALIR)   {
                switch (opcion)        {
                    case INSERTAREQUIPO: insertarEquipo();
                        break;
                    case INSERTARJUGADOR: insertarJugador();
                        break;
                    case VEREQUIPOSLIGA: verLiga();
                        break;
                    case VERJUGADORESEQUIPO: verJugadores();
                        break;
                    case VENDERJUGADOR: venderJugador();
                        break;
                    case SALIR: salir();
                        break;
                }
                opcion = menu();
            }
        }


        public static int menu() {
            System.out.println("********************************");
            System.out.println("MENU DE LA LIGA\n");
            System.out.println("********************************");
            System.out.println("1. Insertar equipo");
            System.out.println("2. Insertar Jugador");
            System.out.println("3. Ver equipos de la liga");
            System.out.println("4. ver jugadores de un equipo");
            System.out.println("5. vender jugador");
            System.out.println("6. Salir");
            System.out.print("Teclea opción: ");
            int opcion = teclado.nextInt();
            while (!opcionValida(opcion)) {
                System.out.print("Opción incorrecta, Teclea opción: ");
                opcion = teclado.nextInt();
            }
            return opcion;
        }

        public static boolean opcionValida(int opcion)    {
            return opcion >= INSERTAREQUIPO && opcion <= SALIR;
        }

        public static void insertarEquipo(){
            String nombre, ciudad;
            System.out.println("Insertar nombre del equipo");
            teclado.nextLine(); // Consumir el salto de línea pendiente
            nombre= teclado.nextLine();
            System.out.println("Inserte la ciudad del equipo");
            ciudad= teclado.nextLine();
            Equipo miEquipo =new Equipo (nombre, ciudad);

            System.out.println("Creando equipo");
            miLiga.añadirEquipo(miEquipo);
            System.out.println("Insertando equipo");
        }

        public static void insertarJugador(){
        String nombreEq,nombreJ,nacionalidad, posicion;
                int edad;
                Equipo miEquipo;


            System.out.println("Indique el nombre del equipo donde quiere insertar el jugador:");
            teclado.nextLine(); // Consumir el salto de línea pendiente
            nombreEq=teclado.nextLine();
            miEquipo =miLiga.getEquipo(nombreEq);

            if (miEquipo==null){}

            System.out.println("Indique el nombre del jugador:");
            nombreJ=teclado.nextLine();

            System.out.println("Indique la nacionalidad del jugador:");
            nacionalidad=teclado.nextLine();
            System.out.println("Indique la edad del jugador:");
            edad=teclado.nextInt();

            System.out.println("Indique la posición del jugador:");
            teclado.nextLine(); // Consumir el salto de línea pendiente
            posicion=teclado.nextLine();
            setPosicion(posicion);

            //no es un setter, es solamente para comprobar que le metes una posicion correcta de las 4 que pueden ser.

            Jugador miJugador= new Jugador (nombreJ, nacionalidad,edad,posicion);
            System.out.println("Creando jugador...");

            miEquipo.adquirirJugador(miJugador);
            System.out.println("Insertando jugador...");
            System.out.println("Jugador"+nombreJ+"insertando en"+nombreEq+"");

            iniciar();
        }

        public static void verLiga(){
            System.out.println("**********COMPOSICIÓN DE LA LIGA*************************");
            System.out.println("EQUIPO          CIUDAD          NUMERO JUGADORES");
            miLiga.mostrarEquipos();
            System.out.println("*********************************************************");
        }

        public static void verJugadores(){
            String nombreE;
            Equipo miEquipo;

            System.out.println("Indique el equipo que quiere visualizar:");
            teclado.nextLine(); // Consumir el salto de línea pendiente
            nombreE=teclado.nextLine();

            System.out.println("**********"+nombreE+"*************************");
            System.out.println("JUGADOR      POSICION    EDAD    NACIONALIDAD    LESIONADO");
            (miLiga.getEquipo(nombreE)).mostrarJugadores();
            System.out.println("*********************************************************");
            iniciar();
        }

        public static void venderJugador(){
            String nombreE,nombreJ;
            Equipo miEquipo;
            System.out.println("Inserte el nombre del equipo donde quiere vender el jugador:");
            teclado.nextLine(); // Consumir el salto de línea pendiente
            nombreE=teclado.nextLine();


            System.out.println("Inserte el nombre del jugador:");
            teclado.nextLine(); // Consumir el salto de línea pendiente
            nombreJ=teclado.nextLine();


            (miLiga.getEquipo(nombreE)).venderJugador(nombreJ);

            System.out.println("Vendiendo jugador...");

            iniciar();
        }

        public static void salir(){
            System.out.println("se sale de la aplicacion");
        }




    public static void setPosicion(String posicion){
        while (!posicionCorrecta(posicion)){
            System.out.println("Posicion Incorrecta");
            posicion=teclado.nextLine();
        }
    }
    public static boolean posicionCorrecta(String posicion){
        return posicion.equals(POR) || posicion.equals(DEF) || posicion.equals(CTC) || posicion.equals(DEL);
    }


}