package access.b;

public class BankAccount {

  // 인스턴트 생성 시 int 형 데이터의 초기값은 0이기 때문에, 굳이 0 으로 초기화 할 필요는 없다.
  private int balance;

  public BankAccount() {
    balance = 0;
  }

  // public 메서드: deposit
  public void deposit(int amount){
    if (isAmountValid(amount)){
      balance += amount;
    }else{
      System.out.println("유효하지 않은 금액입니다.");
    }
  }

  // public 메서드: withdraw
  public void withdraw(int amount) {
    if (isAmountValid(amount) && balance - amount >= 0){
      balance -= amount;
    }else{
      System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }
  }

  // public 메서드: getBalance
  public int getBalance() {
    return balance;
  }

  private boolean isAmountValid(int amount){
    // 금액이 0원보다 커야함
    return amount > 0;
  }

}
