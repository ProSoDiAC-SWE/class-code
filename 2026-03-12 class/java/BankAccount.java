public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String param_owner, double balance){
        
        this.owner = param_owner;
        this.balance = balance;
    }

    public void setOwner(String new_owner){
        this.owner = new_owner;
    }

    public String getOwner(){
        return owner;
    }

    public void setBalance(double new_Balance){
        this.balance = new_Balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amount){
        if (amount > 0){
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if(balance >= amount && amount > 0){
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Ciao " + owner + ". Hai sul conto: " + balance;
    }

    public static void main(String[] args){
        BankAccount acc = new BankAccount("Pippo", 1000);

        acc.deposit(1000);
        acc.withdraw(200);

        System.out.println(acc);
    }
}