package oop1.ex;

public class Account {

    int balance; // 잔액

    // 입금
    void deposit(int amount){
        this.balance += amount;
    }

    // 출금
    void withdraw(int amount){
        // 잔액보다 더 큰 돈을 출금할 수 없다
        // 통장에 남은 잔액과 출금하려는 금액이 같거나, 잔액이 더 크다면 출금가능
        if (this.balance >= amount){
            this.balance -= amount;
        }else{
            System.out.println("잔액 부족");
        }
    }
}
