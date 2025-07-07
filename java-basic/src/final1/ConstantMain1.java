package final1;

public class ConstantMain1 {

  public static void main(String[] args) {
    /*
        프로그램 최대 참여자 수를 1000명으로 제한하였다.
        추후 console의 내용이 없이 다른 개발자가 봤을 때 1000은 알수 없는 숫자가 될것이다.
        개발자를 깜짝 놀래키는 "매직넘버" 가 될 것이다.
        이때는 상수로 한 곳에서 관리하는게 좋다.

        그리고 추후 숫자를 변경해야할 때 중앙 제어가 가능하다.
    */
    System.out.println("프로그램 최대 참여자 수  " + 1000);
    int currentUserCount = 999;
    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);
  }

  private static void process(int currentUserCount){
    System.out.println("참여자 수: " + currentUserCount);
    if(currentUserCount > 1000){
      System.out.println("대기자로 등록합니다.");
    }else{
      System.out.println("게임에 참여합니다.");
    }
  }
}
