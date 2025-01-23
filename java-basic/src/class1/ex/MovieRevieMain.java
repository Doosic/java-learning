package class1.ex;

public class MovieRevieMain {

  public static void main(String[] args) {
    MovieReview movieReview1 = new MovieReview()
        .title("인셉션")
        .review("인생은 무한 루프")
        .build();

    MovieReview movieReview2 = new MovieReview()
        .title("어바웃 타임")
        .review("인생 시간 영화!")
        .build();

    MovieReview movieReview3 = new MovieReview()
        .title("빌더 사용해보기!")
        .review("빌더야")
        .build();

    MovieReview[] movieReviews = new MovieReview[] {movieReview1, movieReview2, movieReview3};

    for (MovieReview m : movieReviews){
      System.out.println("영화 제목:" + m.getTitle() + " 리뷰:" + m.getReview());
    }
  }
}
