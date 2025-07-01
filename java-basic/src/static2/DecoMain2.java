package static2;

public class DecoMain2 {

  /*
    # DecoUtil1
    deco라는 기능은 멤버 변수도 없고, 단순히 기능만을 제공한다.
    우리가 인스턴스가 필요한 이유는 멤버 변수를 사용하는 목적이 큰데, 이 메서드는
    사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.

    그렇다면 인스턴스로 생성할 필요가 있는걸까? (멤버 변수를 사용하지 않기에 객체를 생성 할 의미가 없다.... Utils라면 기능모음정도랄까?)

    멤버변수를 사용하지 않으므로 인스턴스로 계속해서 생성하는 것은 좋지 않은 방향같다.
    이럴때 정적 메서드를 사용할 수 있다.
  */
  public static void main(String[] args) {
    String s = "hello Java!";

    // 정적 메서드는 객체 생성 없이 클래스명 + .(dot) + 메서드 명으로 호출할 수 있다.
    // 메서드 앞에도 static을 붙일 수 있다. 이것을 정적 메서드, 클래스 메서드라고한다. 정적 메서드라는 용어는
    // static 이 정적이라는 뜻이기 때문이고, 클래스 메서드라는 용어는 인스턴스 생성 없이 마치 클래스에 있는 메서드를 호출하는 것처럼 느껴지기 떄문.
    String deco = DecoUtil2.deco(s);

    System.out.println("before: " + s);
    System.out.println("after: " + deco);
  }
}
