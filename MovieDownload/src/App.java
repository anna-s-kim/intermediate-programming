
import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
   
      MoviePosterWriter mpw = new MoviePosterWriter(); 
      
        String[] movies = { "avengers", "inception", "batman", "toy story", "matrix" };
      	
      for (String movieName : movies) {
        Movie movie = new Movie(movieName);
        mpw.setMovieString(movie.getMovieNameForURL());
        mpw.write(movie.getMovieFilename());
        System.out.println("Downloaded poster for:" + movieName);
      }
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a movie name");
      String userMovie = scanner.nextLine();
      Movie userSelectedMovie = new Movie(userMovie);
      mpw.setMovieString(userSelectedMovie.getMovieNameForURL());
      mpw.write(userSelectedMovie.getMovieFilename());
      System.out.println("Downloaded poster for:" + userMovie);
      
      scanner.close();
   }
}
