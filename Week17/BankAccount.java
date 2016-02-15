package Week17;

/**
 * Created by graemewilkinson on 15/02/16.
 */
public class BankAccount {

    public static void main(String[] args) {

    }

    private int balance = 0;

    public int getBalance(){
        return balance;
    }
    public synchronized void deposit (int money){
        balance = balance + money;
    }
    public synchronized int retrieve(int money){
        int result = 0;
        if (balance > money){
            result = money;
        }else{
            result = balance;
        }
        balance = balance - result;
        return result;
    }
}
