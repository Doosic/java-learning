package static2;

public class DecoMain1 {

  /*
    # DecoUtil1
    deco라는 기능은 멤버 변수도 없고, 단순히 기능만을 제공한다.
    우리가 인스턴스가 필요한 이유는 멤버 변수를 사용하는 목적이 큰데, 이 메서드는
    사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.

    그렇다면 인스턴스로 생성할 필요가 있는걸까?

    멤버변수를 사용하지 않으므로 인스턴스로 계속해서 생성하는 것은 좋지 않은 방향같다.
    이럴때 정적 메서드를 사용할 수 있다.
  */
  public static void main(String[] args) {
    String s = "hello Java!";

    // static 이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다. 이것을 인스턴스 메서드라 한다.
    DecoUtil1 utils = new DecoUtil1();
    String deco = utils.deco(s);

    System.out.println("before: " + s);
    System.out.println("after: " + deco);
  }
}
