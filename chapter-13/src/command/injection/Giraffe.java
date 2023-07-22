package command.injection;

@interface Music {
  String[] genres();
}

public class Giraffe {
  // genres is an array annotation element
  @Music(genres = {"Rock and roll"})
  String mostDisliked;

  @Music(genres = "Classical")
  String favorite;

  public static void main(String[] args) {
    System.out.println(new Giraffe().favorite);
  }
}


 class Reindeer {
  //@Music(genres="Blues","Jazz") String favorite; // DOES NOT COMPILE
  //@Music(genres=) String mostDisliked;          // DOES  NOT COMPILE
  //@Music(genres=null) String other;             // DOES NOT COMPILE
  @Music(genres={"Blues","Jazz"}) String alternate;
}
