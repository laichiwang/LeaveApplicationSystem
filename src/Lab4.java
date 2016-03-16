
public class Lab4 {

    public static void main(String[] args) {
        BankServer bs = new BankServer();
        ATMFrontend atm1 = new HSBCATM(bs);
        ATMFrontend atm2 = new BOCATM(bs);

        // Simulate user actions
        atm1.userInsertCardAndInputPassword("22245768790", "000000");
        atm1.userWithdrawMoney(109900);

        atm2.userInsertCardAndInputPassword("5652176800", "123456");
        atm2.userWithdrawMoney(atm2.userCheckBalance());


    }
}
