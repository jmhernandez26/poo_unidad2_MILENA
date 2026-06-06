package poo;

public class SerieDeTV extends ContenidoAudiovisual {

    private int temporadas;
    private Temporada temporada;

    public SerieDeTV(String titulo, int duracion, String genero,
                     int temporadas, Temporada temporada) {

        super(titulo, duracion, genero);
        this.temporadas = temporadas;
        this.temporada = temporada;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Temporada actual: " + temporada.getNumero());
    }
}