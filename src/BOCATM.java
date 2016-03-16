
public class BOCATM extends ATMFrontend {
    private int moneyLeft = 200000;

    public BOCATM(ATMBackend backend) {
        super(backend);
    }

    @Override
    public void userInsertCardAndInputPassword(String cardNo, String password) {
        if (this.moneyLeft < 10000) {
            System.out.println("Not enough cash!");
        } else if (cardNo.startsWith("356")) {
            String code = this.getBackend().verifyCard(cardNo, password);
            this.setCurrentSessionCode(code);
        } else {
            System.out.println("Unsupported card!");
        }
    }

    @Override
    protected void provideMoney(int amount) {
        if (amount > 10000) {
            System.out.println("Cannot withdraw over 10000 each time");
        } else {
            this.moneyLeft -= amount;
        }
    }
}