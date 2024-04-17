package BankSystemUsingThreads;

public class bankmain
{
    public static void main(String[] args) throws InterruptedException {
        Account acc=new Account();
        AccountHolder accountHolder=new AccountHolder(acc);
        Thread has=new Thread(accountHolder);
        Thread san=new Thread(accountHolder);
        has.setName("Hasitha");
        san.setName("Sandun");
        has.start();

        san.start();
    }
}
