/**
 * Created by T00036644 on 31/10/2017.
 */
public abstract class BankAccount {
    private Person accHolder;
    private int accNum;
    protected double balance;

    public BankAccount() {
        this(new Person(),0,0);
    }

    public BankAccount(Person accHolder, int accNum, double balance) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                accHolder.toString() +
                "\nAccoount Number: " + accNum +
                "\nBalance=" + balance;
    }
}
