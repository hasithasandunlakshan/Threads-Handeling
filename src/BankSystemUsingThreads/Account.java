package BankSystemUsingThreads;

public class Account
{
    private int balance=10000;
    public int getBalance(){
        return balance;

    }
    public void withdraw(int ammount){
        this.balance=this.balance -ammount;

    }
}
