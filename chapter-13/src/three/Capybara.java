package three;

@interface Rhythm {
  String[] value();
}

public class Capybara {
  @Rhythm(value = {"Swing"})
  String favorite;

  @Rhythm(value = "R&B")
  String secondFavorite;

  @Rhythm({"Classical"})
  String mostDisliked;

  @Rhythm("Country")
  String lastDisliked;
}