class Movie{

int movieId;
String movieName;
String director;
String producer;
String hero;
String heroine;
String genre;
String language;
String releaseYear;
double budget;
double boxOffice;
String musicDirector;
String cinematographer;
String editor;
String productionCountry;
String movieDuration;
String certification;
String movieStatus;
String streamingPlatform;
String audienceRating;

Movie(int movieId,String movieName,String director,String producer,
String hero,String heroine,String genre,String language,String releaseYear,
double budget,double boxOffice,String musicDirector,String cinematographer,
String editor,String productionCountry,String movieDuration,
String certification,String movieStatus,String streamingPlatform,
String audienceRating){

this.movieId=movieId;
this.movieName=movieName;
this.director=director;
this.producer=producer;
this.hero=hero;
this.heroine=heroine;
this.genre=genre;
this.language=language;
this.releaseYear=releaseYear;
this.budget=budget;
this.boxOffice=boxOffice;
this.musicDirector=musicDirector;
this.cinematographer=cinematographer;
this.editor=editor;
this.productionCountry=productionCountry;
this.movieDuration=movieDuration;
this.certification=certification;
this.movieStatus=movieStatus;
this.streamingPlatform=streamingPlatform;
this.audienceRating=audienceRating;

}

public void getMovieDetails(){

System.out.println("--------------------------------");
System.out.println("Movie ID: "+this.movieId);
System.out.println("Movie Name: "+this.movieName);
System.out.println("Director: "+this.director);
System.out.println("Producer: "+this.producer);
System.out.println("Hero: "+this.hero);
System.out.println("Heroine: "+this.heroine);
System.out.println("Genre: "+this.genre);
System.out.println("Language: "+this.language);
System.out.println("Release Year: "+this.releaseYear);
System.out.println("Budget: "+this.budget);
System.out.println("Box Office: "+this.boxOffice);
System.out.println("Music Director: "+this.musicDirector);
System.out.println("Cinematographer: "+this.cinematographer);
System.out.println("Editor: "+this.editor);
System.out.println("Production Country: "+this.productionCountry);
System.out.println("Movie Duration: "+this.movieDuration);
System.out.println("Certification: "+this.certification);
System.out.println("Movie Status: "+this.movieStatus);
System.out.println("Streaming Platform: "+this.streamingPlatform);
System.out.println("Audience Rating: "+this.audienceRating);

}

}