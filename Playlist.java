package Modelo;

import java.util.ArrayList;

public abstract class Playlist {

    String nombre;
    ArrayList<Cancion> canciones;

    public Playlist(String nombre, ArrayList<Cancion> canciones)
    {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public Playlist(String nombre) {
    }

    public void agregarCancion() {

    }

    public void eliminarCancion() {

    }

    public void mostrarPlaylist() {

    }
}
