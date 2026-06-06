package poo;

public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;

    public VideoYouTube(String titulo, int duracion, String genero, String canal) {
        super(titulo, duracion, genero);
        this.canal = canal;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Canal: " + canal);
    }
}