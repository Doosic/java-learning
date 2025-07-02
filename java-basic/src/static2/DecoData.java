package static2;

public class DecoData {

  private int instanceValue;
  private static int staticValue;


  public static void staticCall() {
    /*
      - 인스턴스(멤버) 변수를 정적 메서드에서 사용하기 위해서는 클래스를 생성해야한다.
      1.클래스에 소속되기 때문에 인스턴스가 생성되기 전에는 아무런 참조값이 존재하지 않는다.
      2.그러므로 인스턴스가 생성되고 참조값을 할당받아야 사용할 수 있다.
    */
    //instanceValue++; // 인스턴스 변수 접근, compile error
    //instanceMethod(); // 인스턴스 메서드 접근, compile error

    staticValue++; // 정적 변수 접근
    staticMethod(); // 정적 메서드 접근
  }

  // 인스턴스 생성 후 주소를 할당받은 본인의 인스턴스 메서드에 접근
  // 정적 변수, 메서드는 당연히 접근 가능하다.
  public void instanceCall() {
    instanceValue++; // 인스턴스 변수 접근
    instanceMethod(); // 인스턴스 메서드 접근

    staticValue++; // 정적 변수 접근, static은
    staticMethod(); // 정적 메서드 접근
  }

  private void instanceMethod() {
    System.out.println("instanceValue="+instanceValue);
  }

  private static void staticMethod() {
    System.out.println("staticValue="+staticValue);
  }
}
