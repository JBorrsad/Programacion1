﻿/**
 *
 */
public class DemoMp3 {

    private ReproductorMP3 mp3;

    /**
     * Constructor  
     */
    public DemoMp3() {
        mp3 = new ReproductorMP3(1048576);
    }

    /**
     *
     *
     */
    public void demoAdd() {
        mp3.addFichero(new FicheroMusica("Título 01", 4096, 468));
        mp3.addFichero(new FicheroMusica("Título 02", 5120, 378));
        mp3.addFichero(new FicheroMusica("Título 03", 4096, 336));
        mp3.addFichero(new FicheroMusica("Título 04", 5120, 510));
        mp3.addFichero(new FicheroJPG("imagen 01", 5120, Compresion.ALTA));
        mp3.addFichero(new FicheroJPG("imagen", 6000, Compresion.ALTA));
        mp3.addFichero(new FicheroJPG("imagen 02", 5100, Compresion.MEDIA));
        mp3.addFichero(new FicheroJPG("imagen 02", 5100, Compresion.MEDIA));
        mp3.addFichero(new FicheroJPG("imagen 03", 4000, Compresion.BAJA));
        mp3.addFichero(new FicheroJPG("imagen 03", 5120, Compresion.ALTA));
        mp3.addFichero(new FicheroJPG("imagen", 2000, Compresion.MEDIA));

    }

    /**
     *
     */
    public void demoCapacidad() {
        System.out.println("Capacidad del MP3: " + mp3.getCapacidad() + " bytes");
    }

    /**
     *
     */
    public void demoMostrarCanciones() {
        System.out.println("Canciones en el MP3 ");
        mp3.mostrarCanciones();
    }

    /**
     *
     */
    public void demoMostrarReproductor() {
        System.out.println("Situación inicial del Reproductor MP3 ");
        mp3.mostrarReproductor();
    }

    /**
     *
     */
    public void demoReset() {
        mp3.reset();
    }

    /**
     *
     */
    public void demoOrdenarPorTitulo() {
        System.out.println("Después de ordenar por título ");
        mp3.ordenarPorTitulo();

    }

    /**
     *
     */
    public void demoOrdenarPorTamaño() {
        System.out.println("Después de ordenar por tamaño ");
        mp3.ordenarPorTamaño();

    }

    /**
     *
     */
    public void demoReordenar() {
        System.out.println("Después de reordenar aleatoriamente ");
        mp3.reordenar();
    }

    /**
     *
     */
    public void demoBorrarFicheroImagen() {
        String titulo = "imagen";
        System.out.println("Después de borrar el fichero de imagen con el título " + titulo);
        mp3.borrarFicheroImagen(titulo);

    }

}
