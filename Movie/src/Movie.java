public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String insyanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + insyanceType + " film");
    }
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFriction(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" ..%s %n".repeat(3),
                "Pleasant Scene",
                "Adventure Scene",
                "Villen end");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" ..%s %n".repeat(3),
                "Funny scene",
                "Super funny scene",
                "Happy end");
    }
}

class ScienceFriction extends Movie {
    public ScienceFriction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s %n".repeat(3),
                "Aline Attack",
                "Fighter's fight Alien",
                "Aline Planet Blast");
    }
}
