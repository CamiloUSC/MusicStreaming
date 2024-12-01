package Modelo;

public class Artista {
    String nombre;
    String generomusical;

    public Artista(String nombre, String generomusical) {
        this.nombre = nombre;
        this.generomusical = generomusical;
    }

    public void mostrarDetalles() {
        System.out.println("El nombre del artista es: " + nombre);
        System.out.println("El generomusical del artista es: " + generomusical);
    };
}
