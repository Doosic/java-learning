package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

  public static void main(String[] args) {
    System.out.println("1. 정적 호출");

    // 자주 사용하는 정적 메서드는 import static을 사용할 수 있다.(클래스명 생략)
    staticCall();
    staticCall();
    staticCall();
    staticCall();

    System.out.println("2. 인스턴스 호출1");
    DecoData deco = new DecoData();
    deco.instanceCall();

    System.out.println("3. 인스턴스 호출2");
    DecoData deco2 = new DecoData();
    deco2.instanceCall();
  }
}
