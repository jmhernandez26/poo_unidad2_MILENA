package poo;

public class ContenidoAudiovisual {

    protected String titulo;
    protected int duracion;
    protected String genero;

    public ContenidoAudiovisual(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Género: " + genero);
    }
}
// Actualización final del proyecto
// Tercer commit: revisión y documentación final
