package Modelo;

public class Cancion {

String titulo;
int duracionseg;
Artista artista;

public Cancion(String titulo, int duracionseg, Artista artista) {
    this.titulo = titulo;
    this.duracionseg = duracionseg;
    this.artista = artista;
}

   public void mostrarDetalles(){
    System.out.println("Su autor es " + artista);
    System.out.println("El titulo de la cancion es " + titulo);
    System.out.println("Su duracion es " + duracionseg);
   }
}
