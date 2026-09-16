package lec10_AbstractclassandInterface.BankAccount;

public class SavingAccount extends Account {

    public SavingAccount(double blance) {
        super(blance);
    }

    @Override
    public String GetAccountType() {
        return "Saving account";

    }

}
