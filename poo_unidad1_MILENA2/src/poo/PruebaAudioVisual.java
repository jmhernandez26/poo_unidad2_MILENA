package poo;

public class PruebaAudioVisual {

    public static void main(String[] args) {

        Actor actor = new Actor("Tom Cruise");
        Temporada temporada = new Temporada(5);
        Investigador investigador = new Investigador("Carl Sagan");

        Pelicula pelicula = new Pelicula(
                "Mision Imposible",
                120,
                "Accion",
                "Christopher McQuarrie",
                actor);

        SerieDeTV serie = new SerieDeTV(
                "Breaking Bad",
                45,
                "Drama",
                5,
                temporada);

        Documental documental = new Documental(
                "Cosmos",
                60,
                "Ciencia",
                "Universo",
                investigador);

        VideoYouTube video = new VideoYouTube(
                "Tutorial Java",
                20,
                "Educativo",
                "ProgramacionFacil");

        Cortometraje corto = new Cortometraje(
                "La Ultima Luz",
                15,
                "Suspenso",
                "UPS Producciones");

        System.out.println("===== PELICULA =====");
        pelicula.mostrarDetalles();

        System.out.println("\n===== SERIE =====");
        serie.mostrarDetalles();

        System.out.println("\n===== DOCUMENTAL =====");
        documental.mostrarDetalles();

        System.out.println("\n===== VIDEO YOUTUBE =====");
        video.mostrarDetalles();

        System.out.println("\n===== CORTOMETRAJE =====");
        corto.mostrarDetalles();
    }
}