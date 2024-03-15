package Festival.Modulos;

import java.time.format.DateTimeFormatter;
import java.util.*;



public class Agenda {
    private TreeMap<Mes, ArrayList<Festival>> agenda;
    
    public Agenda() {
        this.agenda = new TreeMap<>();
    }


    public void addFestival(Festival f) {
        Mes m = f.getMes();
        agenda.putIfAbsent(m, new ArrayList<>());
        agenda.get(m).add(obtenerPosicionDeInsercion(agenda.get(m),f),f);
    }

    public int obtenerPosicionDeInsercion(ArrayList<Festival> arrai, Festival f) {
        Comparator<Festival> comparador = new Comparator<Festival>() {
            @Override
            public int compare(Festival f1, Festival f2) {
                return f1.getNombre().compareTo(f2.getNombre());
            }
        };

        TreeSet<Festival> ordenar = new TreeSet<>(comparador);
        ordenar.addAll(arrai);
        ordenar.add(f);

        int i = 0;
        for (Festival festival : ordenar) {
            if (festival.equals(f)) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        for (Map.Entry<Mes, ArrayList<Festival>> entrada : agenda.entrySet()) {
            Mes mes = entrada.getKey();
            ArrayList<Festival> festivales = entrada.getValue();


            sb.append(mes.name()).append(" (").append(festivales.size()).append(" festival/es)").append("\n");

            for (Festival f : festivales) {

                sb.append(f.toString()).append("\n");
            }
        }

        return sb.toString();
    }


    public int festivalesEnMes(Mes mes) {
        if (agenda.containsKey(mes)) {
            return agenda.get(mes).size();
        } else {
            return 0 ;

        }
    }


    public  TreeMap<Estilo,TreeSet<String>>  festivalesPorEstilo() {

        //es el metodo mas jodido que hemos hecho en toda la asignatura


        //he estudiado un poco la clase comparator y con la funcion de auto completar de intelli he conseguido este comparator.

            Comparator<Estilo> E=(Comparator.naturalOrder());
            TreeMap<Estilo,TreeSet<String>> result= new TreeMap<>(E);


            for (Estilo e : Estilo.values()) {
            result.put(e, new TreeSet<String>());
        }

            for (Mes m: agenda.keySet()) {

                ArrayList <Festival>fes = agenda.get(m);

                for (Festival f : fes) {

                    for (Estilo e : f.getEstilos()) {

                        result.putIfAbsent(e, new TreeSet<>());
                        result.get(e).add(f.getNombre());
                    }
                }
            }
            return result ;

    }


    public int cancelarFestivales(HashSet<String> lugares, Mes mes) {

        if (!agenda.containsKey(mes)) {
            return -1;
        }

        ArrayList<Festival> festivalesEnMes = agenda.get(mes);
        Iterator<Festival> it = festivalesEnMes.iterator();
        int cancelados = 0;

        while (it.hasNext()) {
            Festival festival = it.next();
            if (lugares.contains(festival.getLugar())) {
                it.remove();
                cancelados++;
            }
        }


        if (festivalesEnMes.isEmpty()) {
            agenda.remove(mes);
        }

        return cancelados;
    }




}








