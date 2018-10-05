public class BankAccount {
    private String accnumm;
    private double balance;
    private Person customer;

    //Accessor
    public String getAccnumm() {
        return accnumm;
    }

    public double getBalance() {
        return balance;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setAccnumm(String accnumm) {
        this.accnumm = accnumm;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    //Convert to String

    public String toString() {
        return "Account Number: " + accnumm + "\nBalance: " + String.format("%.2f",balance) + "\nAccount holder: " + customer;
    }

    //Constructors
    public BankAccount() {
        this("No Account Number Specified", 0.0, null);
    }

    public BankAccount(String a, double b, Person p) {
        this.accnumm = a;
        this. balance = b;
        this.customer = p;
    }

    //Additional Methods
    public void lodgeMoney(double in) {
        this.balance += in;
    }

    public void withdrawMoney(double out) {
        this.balance -= out;
    }
}
