public class TestAccounts {
    public static void main(String[] args) {
        
        Accounts a1 = new Accounts(1000);
        System.out.println(a1.deposit(200));

        try {
            System.out.println(a1.withdraw(1500));
        } catch (BalenceException e) {
            //e.printStackTrace();
            //System.out.println(e);
            System.out.println(e.getMessage());
        }
}
    
}
