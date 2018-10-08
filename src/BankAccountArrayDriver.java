import javax.swing.*;

public class BankAccountArrayDriver {
    public static void main(String[] args){
        BankAccount[] bankAccounts = new BankAccount[Integer.parseInt(JOptionPane.showInputDialog("How many accounts would you like to add?"))];

        for(int i = 0; i < bankAccounts.length; i++) {
            String num = JOptionPane.showInputDialog("Enter account number: ");
            double bal = Double.parseDouble(JOptionPane.showInputDialog("Enter account balance: "));
            Person name = new Person(JOptionPane.showInputDialog("Enter Name: "));

            bankAccounts[i] = new BankAccount(num, bal, name);
        }
        
        JOptionPane.showMessageDialog(null, bankAccounts);

    }

}
