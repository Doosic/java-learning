package ref;

public class MethodChange2 {

  public static void main(String[] args) {
    Data dataA = new Data();
    dataA.value = 10;
    System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
    // 매개변수 x에 값의로 a가 전달되었지만, 기본형이기에 값의 변경이 일어나지 않는다.
    changeReference(dataA);
    System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
  }

  static void changeReference(Data dataX){
    dataX.value = 20;
  }
}
