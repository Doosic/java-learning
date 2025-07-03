package static2;

import oop1.ValueData;

public class ValueDataMain {

  public static void main(String[] args) {
    ValueData valueData = new ValueData();
    add(valueData);

//    인스턴스 생성 후 호출(정적 메서드가 아닐 시)
//    ValueDataMain valueDataMain = new ValueDataMain();
//    valueDataMain.add(valueData);
  }

  /*
    main() 은 정적 메서드이기 때문에 정적 메서드만 호출해서 사용할 수 있다.
    정적 메서드가 아니라면 인스턴스를 생성 후 사용 가능하다.
  */
   static void add(ValueData valueData){
    valueData.value ++;
    System.out.println("숫자 증가 value=" + valueData.value);
  }
}
