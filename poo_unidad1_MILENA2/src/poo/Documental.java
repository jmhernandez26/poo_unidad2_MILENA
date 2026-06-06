package poo;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracion, String genero,
                      String tema, Investigador investigador) {

        super(titulo, duracion, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tema: " + tema);
        System.out.println("Investigador: " + investigador.getNombre());
    }
}