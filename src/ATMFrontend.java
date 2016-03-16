
public abstract class ATMFrontend {
    private String currentSessionCode;
    private ATMBackend backend;

    public abstract void userInsertCardAndInputPassword(String cardNo, String password);
    protected abstract void provideMoney(int amount);

    public ATMFrontend(ATMBackend backend) {
        this.setBackend(backend);
    }

    public int userCheckBalance() {
        return this.getBackend().checkBalance(this.currentSessionCode);
    }

    public void userWithdrawMoney(int amount) {
        if (getBackend().withdrawCash(this.currentSessionCode, amount)) {
            this.provideMoney(amount);
        }
    }

    protected void setCurrentSessionCode(String code) {
        this.currentSessionCode = code;
    }

    protected String getCurrentSessionCode() {
        return this.currentSessionCode;
    }

    protected ATMBackend getBackend() {
        return backend;
    }

    protected void setBackend(ATMBackend backend) {
        this.backend = backend;
    }
}