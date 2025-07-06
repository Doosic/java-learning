package final1;

public class FieldInit {

  // 변수명: 자바의 관례, 상수는 대문자로 입력한다.
  static final int CONST_VALUE = 10;
  final int value = 10;

  // final에 초기값이 들어간 경우에는 따로 초기화 불가능(값이 한번 셋팅되면 끝)
//  public FieldInit(int value){
    //this.value = value;
//  }
}
