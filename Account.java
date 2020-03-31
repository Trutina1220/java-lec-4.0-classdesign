public class Account {
    private int id ;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + this.customer.toString() +
                ", balance=$" + (double)Math.round(this.balance*100)/100 +
                '}';
    }

    public String getCustomerName()
    {
        return this.customer.getName();
    }

    public Account deposit(double amount,Account account)
    {
        account.balance += amount;
        return account;

    }

    public Account withdraw(double amount, Account account)
    {
        if(account.balance>=amount)
        {
            account.balance -= amount;
        }
        else
        {
            System.out.println("Amount withdrawn exceeds the current balance");
        }
        return account;
    }

}
