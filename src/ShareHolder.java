public class ShareHolder extends Vip{

    private int cdBalance;
    private int interest;
    private InterestRate cdInterestRate;


    public InterestRate getCdInterestRate() {
        return cdInterestRate;
    }

    public ShareHolder(String name, int creditLimit, String emailAddress) {
        super("and Shareholder "+ name, 100000, name + "@bank.com");
        safeDeposit("Don");
    }

    public static void ViewHoldings(String name){
        System.out.println("Share Holder " + name + " viewed holdings.");

    }

    @Override
    public void safeDeposit(String name) {
        ViewHoldings(name);
        super.safeDeposit("Share Holder " + name);
    }

    InterestRate going = new InterestRate(Math.random() * 6); // random number generates double must cast to int

}
