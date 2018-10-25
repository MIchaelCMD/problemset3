/**
 * Created by T00036644 on 31/10/2017.
 */
public class SavingsAccount extends BankAccount implements Taxable {
    private double taxRate;
    private final String TYPE="Savings";

    public SavingsAccount(double taxRate) {
        super();
        this.taxRate = taxRate;
    }

    public SavingsAccount(Person accHolder, int accNum, double balance, double taxRate) {
        super(accHolder, accNum, balance);
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }


    @Override
    public double calcTax() {

        double taxamount=balance*taxRate/100;

        return 0;
    }

    @Override
    public String toString() {
        return "Account Type: "+ TYPE+super.toString()+
                "\ntaxRate: " + taxRate +"\n";
    }
}
