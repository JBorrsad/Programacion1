package Festival.IO;

import Festival.Modulos.Agenda;
import Festival.Modulos.Estilo;
import Festival.Modulos.Festival;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * La clase contiene m�odos est�ticos que permiten
 * cargar la agenda de festivales leyendo los datos desde
 * un fichero
 */
public class FestivalesIO {


    public static void cargarFestivales(Agenda agenda) {
        Scanner sc = null;
        try {
            sc = new Scanner(FestivalesIO.class.
                    getResourceAsStream("/festivales.csv"));
            while (sc.hasNextLine()) {
                String lineaFestival = sc.nextLine();
                Festival festival = parsearLinea(lineaFestival);
                agenda.addFestival(festival);

            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }

    /**
     * se parsea la l�nea extrayendo sus datos y creando y
     * devolviendo un objeto Festival.Modulos.Festival
     *
     * @param lineaFestival los datos de un festival
     * @return el festival creado
     */
    public static Festival parsearLinea(String lineaFestival) {

        String[] tokens = lineaFestival.split(":");

        Festival mifestival = new Festival(formatoNombre(tokens[0]), formatoLugar(tokens[1]), formatoFechaInicio(tokens[2]), formatoDuracion(tokens[3]), formatoEstilos(tokens));


        return mifestival;
    }


    public static String formatoNombre(String nombre) {

        nombre = nombre.strip().trim();
        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1, nombre.length());
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == ' ') {

                nombre = nombre.substring(0, i+1) +nombre.substring(i + 1, i + 2).toUpperCase() + nombre.substring(i + 2);
            }
        }
        return nombre;
    }


    public static String formatoLugar(String lugar) {
        return (lugar.trim()).toUpperCase();
    }

    public static LocalDate formatoFechaInicio(String fecha) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaLD = LocalDate.parse(fecha.trim(), f);
        return fechaLD;
    }


    public static int formatoDuracion(String duracion) {
        return Integer.valueOf(duracion.trim());
    }



    public static HashSet<Estilo> formatoEstilos(String[] tokens) {



        HashSet<Estilo> estilos = new HashSet<>();


        for (int i=4;i<tokens.length;i++) {
            estilos.add(Estilo.valueOf(tokens[i].trim().toUpperCase()));
        }  return estilos;
            }




}
