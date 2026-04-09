public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro(480, 2023, "READY PLAYER ONE", 81000.0);
        Disco disco = new Disco(6.2f, "Thriller", 95000.0);
        Video video = new Video(4.48f, Idioma.ESPANOL, "5INCO MENTARIOS", 38000.0);

        System.out.println("--- Sistema de Gestion de Publicaciones ---");
        System.out.println(libro);
        System.out.println(disco);
        System.out.println(video);
    }
}
