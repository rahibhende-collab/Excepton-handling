
//Domain object class for bank accounts 
public class Accounts{
    private double balance;

    public Accounts(double balance){
       this.balance = balance;
    }

    public double deposit(double amount){
        if(amount > 0){
            balance += amount;
            return balance;
        } else 
              throw new NumberFormatException("Please provide non-negative number");
    }

    public double withdraw(double amount) throws BalenceException{
        if(amount < 0)
            throw new NumberFormatException("Please provide non-negative number");
        else if(amount <= balance)
            balance -= amount;
         else 
           throw new BalenceException("Insufficient funds");
        return balance;
    }
}