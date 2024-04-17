package BankSystemUsingThreads;

public class AccountHolder implements  Runnable {
    private Account account;
AccountHolder(Account acc){
    this.account=acc;

}
    @Override
    public synchronized   void run() {

        //System.out.println(Thread.currentThread().getName()+"'s  Attemt   "+i);
        makewithdraw(2000);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (account.getBalance()<0){
            System.out.println("account is overdrwan");
        }


    }
    public void  makewithdraw(int withdrawalAmmount){
    if(account.getBalance()>=withdrawalAmmount){
        System.out.println(Thread.currentThread().getName()+"   is going to withdrawal  "+withdrawalAmmount);
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException ex){

        }
        account.withdraw(withdrawalAmmount);
        System.out.println(Thread.currentThread().getName()+"  is completed withdrwal  "+withdrawalAmmount);
    }
    else{
        System.out.println(" Not enogh coins for   "+Thread.currentThread().getName());
    }



    }
}
