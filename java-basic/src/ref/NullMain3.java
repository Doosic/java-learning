package ref;

public class NullMain3 {

  public static void main(String[] args) {
    BigData bigData = new BigData();
    System.out.println("bigData.count=" + bigData.count); // 0
    System.out.println("bigData.data=" + bigData.data); // null(참조형 기본값은 null)

    // null값에 .value를 가리켜 예외 발생
    System.out.println("bigData.data.value" + bigData.data.value); // NullPointerException 예외 발생
  }
}
