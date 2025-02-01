package ref;

public class MethodChange1 {

  public static void main(String[] args) {
    int a = 10;
    System.out.println("메서드 호출 전: a = " + a);
    // 매개변수 x에 값의로 a가 전달되었지만, 기본형이기에 값의 변경이 일어나지 않는다.
    changePrimitive(a);
    System.out.println("메서드 호출 후: a = " + a);
  }

  static void changePrimitive(int x){
    x = 20;
  }
}
