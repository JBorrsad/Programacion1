import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Mapa miMapa = new Mapa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre del explorador");
        String nombreExplorador = scanner.nextLine();
        Explorador miExplorador = new Explorador(nombreExplorador);
        int opcion;
        int direccion;
            System.out.println("Menú:");
            System.out.println("*******************************************************");
            System.out.println("Bienvenido al juego del explorador");
            System.out.println("*******************************************************");
        do {
            System.out.println("1. Ver posición actual del explorador");
            System.out.println("2. Mover explorador");
            System.out.println("3. Explorar.");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(miExplorador.getNombre() + " esta en la siguiente posicion del tablero: " + "\n" +
                            "Columna: " + miExplorador.getPosicionActual().getCoordenadaCol() + "\n" + "Fila: " +
                            miExplorador.getPosicionActual().getCoordenadaFila());
                    break;
                case 2:
                    System.out.println("Indique la dirección de movimiento:");
                    System.out.println("1- ARRIBA");
                    System.out.println("2- ABAJO");
                    System.out.println("3- IZQUIERDA");
                    System.out.println("4- DERECHA.");
                    direccion = scanner.nextInt();
                    miExplorador.Moverse(direccion);
                    int ganaopierde = miExplorador.checkPosicion(miMapa);
                    if (ganaopierde == 2 || ganaopierde == 1){
                        opcion = 4;
                    }
                    break;
                case 3:
                    System.out.println("Tienes " + miExplorador.Explorar(miMapa) + " minas cerca de ti");
                    break;
                case 4:
                    Salir();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
        while (opcion != 4);
    }
    public static void Salir(){
        System.out.println("Estas saliendo de este programa");
    }
}
