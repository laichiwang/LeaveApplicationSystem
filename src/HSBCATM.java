
public class HSBCATM extends ATMFrontend {

    private int moneyLeft = 100000;

    public HSBCATM(ATMBackend backend) {
        super(backend);
    }

    @Override
    public void userInsertCardAndInputPassword(String cardNo, String password) {
        if (cardNo.startsWith("222")) {
            String code = this.getBackend().verifyCard(cardNo, password);
            this.setCurrentSessionCode(code);
        } else {
            System.out.println("Unsupported card!");
        }
    }

    @Override
    protected void provideMoney(int amount) {
        if (moneyLeft - amount < 0) {
            System.out.println("Not enough money");
        } else {
            moneyLeft -= amount;
        }
    }


}