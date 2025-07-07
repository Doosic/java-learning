package final1;

public class FinalRefMain {

  public static void main(String[] args) {
    final Data data = new Data();
    //data = new Data(); 참조값 변경 불가

    // 참조 대상의 값은 변경 가능
    // 보관하고있는 주소지는 변경이 불가능하나, 객체 내용물은 변경할 수 있다.
    data.value = 10;
    System.out.println(data.value);
    data.value = 20;
    System.out.println(data.value);
  }
}
