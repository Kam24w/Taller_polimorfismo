public class Video extends Publicacion {
    private float duracionHoras;
    private Idioma idioma;

    public Video() {
        super();
    }

    public Video(float duracionHoras, Idioma idioma) {
        super();
        this.duracionHoras = duracionHoras;
        this.idioma = idioma;
    }

    public Video(float duracionHoras, Idioma idioma, String titulo, double precio) {
        super(titulo, precio);
        this.duracionHoras = duracionHoras;
        this.idioma = idioma;
    }

    public float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + getTitulo() + '\'' +
                ", precio=" + getPrecio() +
                ", duracionHoras=" + duracionHoras +
                ", idioma=" + idioma +
                '}';
    }
}
