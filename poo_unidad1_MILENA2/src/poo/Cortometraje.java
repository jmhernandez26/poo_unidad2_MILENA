package poo;

public class Cortometraje extends ContenidoAudiovisual {

    private String productor;

    public Cortometraje(String titulo, int duracion, String genero, String productor) {
        super(titulo, duracion, genero);
        this.productor = productor;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Productor: " + productor);
    }
}