class Movie {

    String movieName;
    String movieNameForUrl;
    String movieScreenshotFilename;
    
    Movie(String name) {
        movieName = name;
        movieNameForUrl = getMovieNameForURL();
        movieScreenshotFilename = getMovieFilename();
    }

    String getMovieNameForURL() {
        return movieName.replace(" ", "%20");
    } 

    String getMovieFilename() {
        return movieName.replace(" ", "_") + ".jpg";
    } 
}
