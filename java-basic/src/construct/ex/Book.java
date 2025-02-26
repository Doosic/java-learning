package construct.ex;

public class Book {
  String title;
  String author;
  int page;

  public Book(){
    // null 값이 나오면 안되기 때문에 빈값을 넣어준다.
    this("", "", 0);
  };

  public Book(String title, String author){
    this(title, author, 0);
  }

  public Book(String title, String author, int page){
    this.title = title;
    this.author = author;
    this.page = page;
  }

  public void displayInfo(){
    System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지: " + this.page);
  }
}
