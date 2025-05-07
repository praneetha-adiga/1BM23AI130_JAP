public class Lab8
{

    class LessBalanceException extends Exception {
        public LessBalanceException(double amount) {
            super("Withdraw amount (" + amount + " Rs) is not possible.");
        }
    }

    class Account {
        double balance;
        static final double MIN_BALANCE = 500;

        public Account() {
            balance = MIN_BALANCE;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited " + amount + " Rs. New balance: " + balance + " Rs");
        }

        public void withdraw(double amount) throws LessBalanceException {
            if (balance - amount < MIN_BALANCE) {
                throw new LessBalanceException(amount);
            }
            balance -= amount;
            System.out.println("Withdrawn " + amount + " Rs. New balance: " + balance + " Rs");
        }
    }

    public static void main(String[] args) {
        Lab8 outer = new Lab8();
        Account myAccount = outer.new Account();

        myAccount.deposit(1000);

        try {
            myAccount.withdraw(700);
            myAccount.withdraw(1000);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
