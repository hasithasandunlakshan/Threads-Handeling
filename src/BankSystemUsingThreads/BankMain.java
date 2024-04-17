package BankSystemUsingThreads;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account();
        AccountHolder accountHolder = new AccountHolder(acc);
        Thread hasithaThread = new Thread();
        Thread sandunThread = new Thread();
        hasithaThread.start();
        sandunThread.start();
        hasithaThread.join();
        sandunThread.join();
        // Create threads for account holders
        for(int i=0;i<6;i++){
            int k=0;
            while(k==0){
                if(!hasithaThread.isAlive() || !sandunThread.isAlive()){
                    if(!hasithaThread.isAlive()) {
                        k=1;
                        hasithaThread=new Thread(accountHolder);
                        hasithaThread.setName("User's Name -"+i+ " by using Machine Hasitha");
                        hasithaThread.start();



                    }
                    else{
                        k=1;
                        sandunThread=new Thread(accountHolder);
                        sandunThread.setName("User's Name -"+i+ " by using Machine Sandun");
                        sandunThread.start();

                    }
                }
                else{
                    System.out.println("All machines Are Buzy Wait for   "+i);
                    Thread.sleep(2000);
                    k=0;
                    // break;
                }


            }






        }





        // Start threads


        Thread.sleep(1000);

    }
}
