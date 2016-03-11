package other.Thread2;

/**
 * Created by luchk on 09.03.2016.
 */
public class Account2 {
    private long balance;

//    public Account(){
//        this(0L);
//    }

    public Account2(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return balance;
    }

    public synchronized void deposit(long amount){
        checkAmountNotNegative(amount);
        balance += amount;
        notifyAll();
    }

    public synchronized void withDraw(long amount){
        checkAmountNotNegative(amount);
        if (balance < amount){
            throw new IllegalArgumentException("not enough money");
        }
        balance -= amount;
    }

    public synchronized void waitAndWithDraw(long amount) throws InterruptedException {
        checkAmountNotNegative(amount);
        while (balance < amount){
            wait();
        }
    }

    private static void checkAmountNotNegative(long amount){
        if (amount < 0){
            throw new IllegalArgumentException("negative amount");
        }
    }
}
