package Package;

public class UserAccount {
    private String nameClient;
    private String agencyAccount;
    private int numberAccount;
    private float balance;


    public UserAccount (String nameClient, String agencyAccount, int numberAccount, float balance ){
        this.nameClient = nameClient;
        this.agencyAccount = agencyAccount;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }
    public String getNameClient() {
        return nameClient;
    }

    public String getAgencyAccount() {
        return agencyAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return " Conta " +
                getAgencyAccount() +
                "\n Titular: " +
                getNameClient() +
                "\n Saldo: " +
                getBalance();
    }

}
