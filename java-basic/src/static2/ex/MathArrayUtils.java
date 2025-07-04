package static2.ex;

public class MathArrayUtils {
  /*
  * - 수학 유틸리티 클래스
  * 1. sum : 배열의 모든 요소를 더하여 합계를 반환
  * 2. average : 배열의 모든 요소의 평균값 계산
  * 3. min : 배열에서 최소값을 찾는다.
  * 4. max : 배열에서 최대값을 찾는다.
  *
  * - 요구사항
  * 1.MathArrayUtils은 객체를 생성하지 않고 사용해야한다. 누군가 실수로 인스턴스를 생성하지 못하게 막아라.
  * 2.실행 코드에 static import 사용 가능
  * */

  // 외부에서 생성자를 만들지 못하도록 기본 생성자를 private로 제한
  private MathArrayUtils(){};

  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }

  public static double average(int[] arr){
    return (double) sum(arr) / arr.length;
  }

  public static int min(int[] arr){
    int min = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(min > arr[i]){
        min = arr[i];
      }
    }
    return min;
  }

  public static int max(int[] arr){
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
}
