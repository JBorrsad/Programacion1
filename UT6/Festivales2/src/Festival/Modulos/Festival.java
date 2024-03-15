package Festival.Modulos;

import Festival.IO.FestivalesIO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.time.LocalDate.now;


public class Festival {
    private final String nombre;
    private final String lugar;
    private final LocalDate fechaInicio;
    private final int duracion;
    private final HashSet<Estilo> estilos;

    public Festival(String nombre, String lugar, LocalDate fechaInicio, int duracion, HashSet<Estilo> estilos) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.estilos = estilos;

    }

    public static void main(String[] args) {
        System.out.println("Probando clase Festival.Modulos.Festival");
        String datosFestival = "Gazpatxo Rock : " +
                "valencia: 10-03-2024  :1  :rock" +
                ":punk " +
                ": hiphop ";
        Festival f1 = FestivalesIO.parsearLinea(datosFestival);
        System.out.println(f1);

        datosFestival = "black sound fest:badajoz:05-02-2022:  21" +
                ":rock" + ":  blues";
        Festival f2 = FestivalesIO.parsearLinea(datosFestival);
        System.out.println(f2);

        datosFestival = "guitar bcn:barcelona: 28-01-2022 :  170" +
                ":indie" + ":pop:fusion";
        Festival f3 = FestivalesIO.parsearLinea(datosFestival);
        System.out.println(f3);

        datosFestival = "  benidorm fest:benidorm:26-01-2022:3" +
                ":indie" + ": pop  :rock";
        Festival f4 = FestivalesIO.parsearLinea(datosFestival);
        System.out.println(f4);

        System.out.println("\nProbando empiezaAntesQue() empiezaDespuesQue()" +
                "\n");
        if (f1.empiezaAntesQue(f2)) {
            System.out.println(f1.getNombre() + " empieza antes que " + f2.getNombre());
        } else if (f1.empiezaDespuesQue(f2)) {
            System.out.println(f1.getNombre() + " empieza después que " + f2.getNombre());
        } else {
            System.out.println(f1.getNombre() + " empieza el mismo día que " + f2.getNombre());
        }

        System.out.println("\nProbando haConcluido()\n");
        System.out.println(f4);
        System.out.println(f4.getNombre() + " ha concluido? " + f4.haConcluido());
        System.out.println(f1);
        System.out.println(f1.getNombre() + " ha concluido? " + f1.haConcluido());

    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public int getDuracion() {
        return duracion;


    }

    public HashSet<Estilo> getEstilos() {
        return estilos;
    }

    public void addEstilo(Estilo estilo) {
        this.estilos.add(estilo);


    }

    public Mes getMes() {
        Mes mes1=null;
        switch (fechaInicio.getMonth()) {
            case JANUARY:
                mes1 = Mes.ENERO;
                break;
            case FEBRUARY:
                mes1 = Mes.FEBRERO;
                break;
            case MARCH:
                mes1 = Mes.MARZO;
                break;
            case APRIL:
                mes1 = Mes.ABRIL;
                break;
            case MAY:
                mes1 = Mes.MAYO;
                break;
            case JUNE:
                mes1 = Mes.JUNIO;
                break;
            case JULY:
                mes1 = Mes.JULIO;
                break;
            case AUGUST:
                mes1 = Mes.AGOSTO;
                break;
            case SEPTEMBER:
                mes1 = Mes.SEPTIEMBRE;
                break;
            case OCTOBER:
                mes1 = Mes.OCTUBRE;
                break;
            case NOVEMBER:
                mes1 = Mes.NOVIEMBRE;
                break;
            case DECEMBER:
                mes1 = Mes.DICIEMBRE;
                break;
            default:
                System.out.println("Error");
                break;
        }
    return mes1;}

    public boolean empiezaAntesQue(Festival otro) {

        return fechaInicio.isBefore(otro.fechaInicio);

    }

    public boolean empiezaDespuesQue(Festival otro) {

        return this.fechaInicio.isAfter(otro.fechaInicio);
    }

    public boolean haConcluido() {
        return (this.fechaInicio.plusDays(this.getDuracion() - 1)).isBefore(now());
    }

    @Override
    public String toString() {

        LocalDate fFin = fechaInicio.plusDays(this.getDuracion() - 1);

        String conc = concluido(fechaInicio);

        String sty;
        sty= estilos.toString();

        return String.format("%s                    %s%n%s%n%s  %n" +
                        "___________________________",
                nombre, sty, lugar, conc);
    }

    public String concluido(LocalDate fechaInicio) {
        String c;


        if (haConcluido()) {
            c = (fechaInicio.format(DateTimeFormatter.ofPattern("dd MMM.")).toLowerCase()) + "  -  " + (fechaInicio.plusDays(duracion)).format(DateTimeFormatter.ofPattern("dd MMM. yyyy")).toLowerCase() + "  (CONCLUIDO)";
        } else if (fechaInicio.isAfter(now())) {
            LocalDate fFin = fechaInicio.plusDays(this.getDuracion() - 1);
            c = (fechaInicio.format(DateTimeFormatter.ofPattern("dd MMM.")).toLowerCase()) + "  -  " + (fechaInicio.plusDays(duracion)).format(DateTimeFormatter.ofPattern("dd MMM. yyyy")).toLowerCase() + "  (quedan " + Math.abs(ChronoUnit.DAYS.between(fFin, now())) + " días)";
        } else
            c = (fechaInicio.format(DateTimeFormatter.ofPattern("dd MMM.")).toLowerCase()) + "  -  " + (fechaInicio.plusDays(duracion)).format(DateTimeFormatter.ofPattern("dd MMM. yyyy")).toLowerCase() + "  (ON)";

        if (duracion == 1) {

            if (haConcluido()) {
                c = (fechaInicio.format(DateTimeFormatter.ofPattern("dd MMM. yyyy")).toLowerCase()) + "  (CONCLUIDO)";
            } else if (fechaInicio.isAfter(now())) {
                LocalDate fFin = fechaInicio.plusDays(this.getDuracion() - 1);
                c = ((fechaInicio.format(DateTimeFormatter.ofPattern("dd MMM. yyyy")).toLowerCase())+"  (quedan " + Math.abs((ChronoUnit.DAYS.between(fFin, now()))) + " días)");
            } else
                c = (fechaInicio.format(DateTimeFormatter.ofPattern("dd MMM. yyyy")).toLowerCase()) + "  (ON)";
        }
        return c;
    }
}
