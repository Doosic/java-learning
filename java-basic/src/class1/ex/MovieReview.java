package class1.ex;

public class MovieReview {

  private String title;
  private String review;

  public MovieReview title(String title){
    this.title = title;
    return this;
  }

  public MovieReview review(String review){
    this.review = review;
    return this;
  }

  public MovieReview build(){
    return this;
  }

  public String getTitle() {
    return title;
  }

  public String getReview() {
    return review;
  }
}
