public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adventure","Uri ");
        movie.watchMovie();

        Adventure Uri = (Adventure) Movie.getMovie("A","Uri"); //now in this line compiler is saying is everi instance of this is a Adventure - Ans No So Do Casting
        Uri.watchMovie();

        var heriPheri = Movie.getMovie("C","HeraPheri");
        heriPheri.watchMovie();

        Object unknownObject = Movie.getMovie("A","Uri");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchMovie();
        } else if (unknownObject instanceof  Adventure) {
            ((Adventure) unknownObject).watchMovie();
        } else if (unknownObject instanceof ScienceFriction syfy) {
            syfy.watchMovie(); // if this condition comes to be true then object will be created
        }
    }
}
