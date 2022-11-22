public class Account {
    private String number;
    private double balance;
    private String name;
    private String customerEmail;

    public Account(String number, double balance, String customerName, String customerEmail) {
        this.balance = balance;
        this.name = customerName;
        this.customerEmail = customerEmail;
        this.number = number;
        System.out.println(customerName + " " + number + ". Has a balance of: " + balance + " Email(" + customerEmail + ")");
    }

    public void deposit(double depositAmount){
       if (balance < 250000) {
           if (balance + depositAmount > 0 && balance + depositAmount <= 250000) {
               this.balance += depositAmount;
               System.out.println("Deposit of " + depositAmount + " processed. New balance: " + balance);
           } else {
               System.out.println("Unable to process the deposit");
           }
       } else {
           System.out.println("Unable to process the deposit");
       }
    }

    public void withdrawal(double withdrawalAmount){
       if(balance - withdrawalAmount < 0){
          System.out.println("withdrawal not processed " + balance + " available");
       } else {
           balance -= withdrawalAmount;
           System.out.println("withdrawal of " + withdrawalAmount + " processed. Remaining balance: " + balance);
       }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCustomerName(String name) {
        this.name = name;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
