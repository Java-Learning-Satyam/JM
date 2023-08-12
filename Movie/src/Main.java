import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("C", "Fuckrey");
//        movie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter type \n(A -adventure, \n C -Comedy, \n S -Science Friction, \n or Q to quit): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie title ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}
