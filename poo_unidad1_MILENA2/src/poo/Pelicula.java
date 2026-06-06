package poo;

public class Pelicula extends ContenidoAudiovisual {

    private String director;
    private Actor actor;

    public Pelicula(String titulo, int duracion, String genero,
                    String director, Actor actor) {

        super(titulo, duracion, genero);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Director: " + director);
        System.out.println("Actor principal: " + actor.getNombre());
    }
}