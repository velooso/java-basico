package Package;

public class UserAccount {
    private String nameClient;
    private String agencyAccount;
    private int numberAccount;
    private float balance;

    public UserAccount ( String nameClient, String agencyAccount, int numberAccount, float balance ){
        this.nameClient = nameClient;
        this.agencyAccount = agencyAccount;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }
    public UserAccount( String nameClient, String agencyAccount, int numberAccount) {
        this.nameClient = nameClient;
        this.agencyAccount = agencyAccount;
        this.numberAccount = numberAccount;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getAgencyAccount() {
        return agencyAccount;
    }

    public void setAgencyAccount(String agencyAccount) {
        this.agencyAccount = agencyAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
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
