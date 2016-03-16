public interface ATMBackend {

    String verifyCard(String cardNumber, String password);
    int checkBalance(String code);
    boolean withdrawCash(String code, int amount);
}