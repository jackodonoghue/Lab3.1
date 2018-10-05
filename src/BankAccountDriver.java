import javax.swing.*;

public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1997-7991", 1000000.99, new Person("Jack ODonoghue"));

        

        JOptionPane.showMessageDialog(null, bankAccount.toString());
		
		String inOrOut = JOptionPane.showInputDialog("Would you like to withdraw(w) or lodge(l) money? (Enter to exit)");
        
        switch (inOrOut) {
            case "w":
                bankAccount.withdrawMoney(Double.parseDouble(JOptionPane.showInputDialog("Enter withdrawal amount: ")));
                JOptionPane.showMessageDialog(null, "Your new balance is " + bankAccount.getBalance());
                break;

            case "l":
                bankAccount.lodgeMoney(Double.parseDouble(JOptionPane.showInputDialog("Enter lodgmet amount: ")));
                JOptionPane.showMessageDialog(null, "Your new balance is " + bankAccount.getBalance());
                break;

            default:
                JOptionPane.showMessageDialog(null, "Thanks!");
                System.exit(0);
                break;
        }

        JOptionPane.showMessageDialog(null, "Your new balance is " + bankAccount.getBalance());
    }
}
