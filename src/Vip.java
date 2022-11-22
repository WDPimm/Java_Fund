public class Vip {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public Vip(String name, String emailAddress) {
        this.name = name;
       // this.creditLimit = 1;
        this.emailAddress = emailAddress;
        System.out.println("customer: " + name + " is an account pending VIP status and no credit limit yet. Email address: " + emailAddress);
    }

    public Vip(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("VIP " + name + " has a credit limit of: " + creditLimit + ". customer Email: " + emailAddress);
    }

    public void safeDeposit(String name){
        System.out.println(name + " viewed deposit box.");
    }


}
