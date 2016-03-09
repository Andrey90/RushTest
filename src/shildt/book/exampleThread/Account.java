package shildt.book.exampleThread;

/**
 * Created by luchk on 08.03.2016.
 */
public class Account {

    private long balance;

//    public Account(){
//        this(0L);
//    }

    public Account(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return balance;
    }

    public void deposit(long amount){
        checkAmountNotNegative(amount);
        synchronized (this){
            balance += amount;
        }
    }

    public synchronized void withDraw(long amount){
        checkAmountNotNegative(amount);
        if (balance < amount){
            throw new IllegalArgumentException("not enough money");
        }
        balance -= amount;
    }

    private static void checkAmountNotNegative(long amount){
        if (amount < 0){
            throw new IllegalArgumentException("negative amount");
        }
    }
}
