package other.Thread2;

import other.Thread1.Account;

/**
 * Created by luchk on 09.03.2016.
 */
public class RunThread2 {
    public static void main(String[] args) throws InterruptedException {
        Account2 account = new Account2(0);
        new DepositThread(account).start();
        System.out.println("Calling waitAndWithdraw()..........");
        account.waitAndWithDraw(50_000_000);
        System.out.println("waitAndWithdraw() finished");
    }

//    private static class WithdrawThread extends Thread{
//        private final Account2 account;
//        private WithdrawThread(Account2 account){
//            this.account = account;
//        }
//
//        @Override
//        public void run(){
//            for (int i = 0; i < 20_000; i++){
//                account.withDraw(1);
//            }
//        }
//    }

    private static class DepositThread extends Thread{
        private final Account2 account;
        private DepositThread(Account2 account){
            this.account = account;
        }

        @Override
        public  void run(){
            for (int i = 0; i < 50_000_000; i++){
                account.deposit(1);
            }
        }
    }
}
