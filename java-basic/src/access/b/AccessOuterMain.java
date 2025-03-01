package access.b;

import access.a.AccessData;

public class AccessOuterMain {

  public static void main(String[] args) {
    AccessData data = new AccessData();
    // public 호출 가능
    data.publicField = 1;
    data.publicMethod();

    /*
      default 호출 불가, access 에러 발생
      기존 : package access.a;
      현재 : package access.b;
      다른 패키지이므로 호출 불가

      data.defaultField = 1;
      data.defaultMethod();
    */

    // private 호출 불가
    // access 에러 발생
    // data.privateField = 3;
    // data.privateMethod();

    data.innerAccess();
  }
}
