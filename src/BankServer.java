
public class BankServer implements ATMBackend {

    @Override
    public String verifyCard(String cardNumber, String password) {
        return "1phghrojo130492-03";
    }

    @Override
    public int checkBalance(String code) {
        return 1000;
    }

    @Override
    public boolean withdrawCash(String code, int amount) {
        return true;
    }
}