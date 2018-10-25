import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by T00036644 on 31/10/2017.
 */
public class BankingApplication {
    public static void main(String[] args) {

        ArrayList<BankAccount> bankaccounts=new ArrayList<>();
        SavingsAccount[] savingsAccounts=new SavingsAccount[2];

        BankAccount bankaccount;
        SavingsAccount savingsAccount;

        double balance;
        int taxRate,accNum;
        String name,address;
        boolean checkBook;
/**
        int size=Integer.parseInt(JOptionPane.showInputDialog("Enetr number of Savings Accounts"));
        SavingsAccount[] savingsAccounts=new SavingsAccount[size];
        for (int i=0;i<size;i++){
            name= JOptionPane.showInputDialog("Enter Account Holder Name");
            address = JOptionPane.showInputDialog("Enter Account Holder Address");
            accNum =Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));
            balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance"));
            taxRate=Integer.parseInt(JOptionPane.showInputDialog("Enter tax rate"));

            savingsAccount= new SavingsAccount(new Person(name,address), accNum,balance,taxRate);

            savingAccounts[i]= savingsAccount;


 */
        savingsAccount =new SavingsAccount(new Person("John Reynolds",
                "Mountain View"),1234,4500,2);

        //bankaccount =new SavingsAccount(new Person("John Reynolds",
        //        "Mountain View"),1234,4500,2);
        bankaccounts.add(savingsAccount);
        savingsAccounts[0]=savingsAccount;

        savingsAccount =new SavingsAccount(new Person("Deirdre Burke",
                "Sea View"),3322,4800,1.74);

        savingsAccounts[1]=savingsAccount;


        bankaccount =new CurrentAccount(new Person("Mary Moriarty",
                "Lakeside Drive"),4321,5670,true);
        bankaccounts.add(bankaccount);

        String answer="";
        while(JOptionPane.showConfirmDialog(null,"Are you finished?")==JOptionPane.NO_OPTION){

            name= JOptionPane.showInputDialog("Enter Account Holder Name");
            address = JOptionPane.showInputDialog("Enter Account Holder Address");
            accNum =Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));
            balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance"));
            answer = JOptionPane.showInputDialog(("Savings Account(s) or Current Account(c)"));

            if (answer.equals("s")) {
                taxRate = Integer.parseInt(JOptionPane.showInputDialog("Enter tax rate"));
                bankaccount = new SavingsAccount(new Person(name, address), accNum, balance, taxRate);
            }
            else if(answer.equals("c")) {
                checkBook = Boolean.parseBoolean(JOptionPane.showInputDialog("Do you want a check book"));
                bankaccount = new CurrentAccount(new Person(name, address), accNum, balance, checkBook);
            }
            else JOptionPane.showMessageDialog(null, "Invalid choice");

            bankaccounts.add(bankaccount);

        }

        JTextArea jta=new JTextArea("Bank Accounts\n\n");

        for(BankAccount bkacc:bankaccounts){
            jta.append(bkacc.toString());
        }

        JOptionPane.showMessageDialog(null,jta);

        filterAccounts(savingsAccounts,4000);
        display(bankaccounts);
    }

    /** Method to display all bank accounts
     *
     * @param bankaccounts an arraylist of bank accounts
     */

    public static void display(ArrayList<BankAccount> bankaccounts){
        JTextArea jta=new JTextArea("Accounts \n\n");
        for(BankAccount bk:bankaccounts){
            jta.append(bk.toString());
        }
        JOptionPane.showMessageDialog(null, jta);
    }

    public static void filterAccounts(SavingsAccount[] bankaccounts,int thresamount){
        JTextArea jta=new JTextArea("Accounts with Balance > € " + thresamount +"\n\n");
        for(SavingsAccount bk:bankaccounts){
            if (bk.getBalance()>thresamount){
                jta.append(bk.toString() +"\n");
            }
        }
        JOptionPane.showMessageDialog(null, jta);
    }
}
