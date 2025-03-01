package access;

public class Speaker {

  // 같은 클래스 안에서만 해당 필드 변수에 접근이 가능하다.
  private int volume;

  Speaker(int volume){
    this.volume = volume;
  }

  void volumeUp() {
    if (volume >= 100){
      System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
    }else{
      this.volume += 10;
      System.out.println("음량을 10 증가합니다.");
    }
  }

  void volumeDown(){
    volume -= 10;
    System.out.println("volumeDown 호출");
  }

  void showVolume(){
    System.out.println("현재 음량: " + this.volume);
  }
}
