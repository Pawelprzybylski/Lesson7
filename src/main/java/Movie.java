public class Movie {
    private String title;
    private String directorName;
    private int durationInMinutes;
    private int releaseYear ;

    public Movie(String title, String nameAndSurnameDirector, int movieTimeInMinutes, int movieYear) {
        this.title = title;
        this.directorName = nameAndSurnameDirector;
        this.durationInMinutes = movieTimeInMinutes;
        this.releaseYear  = movieYear;
    }
}
