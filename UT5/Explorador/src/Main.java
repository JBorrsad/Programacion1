import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mapa mapa = new Mapa();
        Explorador explorador = new Explorador("Explorador1");

        while (true) {
            System.out.println("*******************************************************");
            System.out.println("Bienvenido al juego del explorador");
            System.out.println("*******************************************************");
            System.out.println("1. Ver posición actual del explorador.");
            System.out.println("2. Mover explorador.");
            System.out.println("3. Explorar.");
            System.out.println("4. Salir.");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    verPosicionActual(explorador);
                    break;
                case 2:
                    moverExplorador(explorador, scanner, mapa);
                    break;
                case 3:
                    explorar(mapa, explorador);
                    break;
                case 4:
                    System.out.println("Saliendo del juego. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void verPosicionActual(Explorador explorador) {
        Posicion posicionActual = explorador.getPosicionActual();
        System.out.println(explorador.getNombre() + " está en la siguiente posición del tablero:");
        System.out.println("COLUMNA: " + posicionActual.getCoordenadaCol());
        System.out.println("FILA: " + posicionActual.getCoordenadaFila());
    }

    private static void moverExplorador(Explorador explorador, Scanner scanner, Mapa mapa) {
        System.out.println("Indique la dirección de movimiento:");
        System.out.println("1- ARRIBA");
        System.out.println("2- ABAJO");
        System.out.println("3- IZQUIERDA");
        System.out.println("4- DERECHA");

        int direccion = scanner.nextInt();
        explorador.moverse(direccion);
        checarResultado(explorador, mapa);
    }

    private static void explorar(Mapa mapa, Explorador explorador) {
        int trampasAlrededor = explorador.explorar(mapa);
        System.out.println("Tiene " + trampasAlrededor + " trampas alrededor.");
        checarResultado(explorador, mapa);
    }

    private static void checarResultado(Explorador explorador, Mapa mapa) {
        int resultado = explorador.checkPosicion(mapa);
        if (resultado == 1) {
            System.out.println(explorador.getNombre() + " ha caído en una trampa. Fin del juego.");
            System.exit(0);
        } else if (resultado == 2) {
            System.out.println(explorador.getNombre() + " ha encontrado el tesoro. ¡ENHORABUENA!");
            System.exit(0);
        }
    }
}
