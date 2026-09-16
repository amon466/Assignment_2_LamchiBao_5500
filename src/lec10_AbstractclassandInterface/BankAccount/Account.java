package lec10_AbstractclassandInterface.BankAccount;

public abstract class Account {
private double blance;

    public Account() {
    }

    public Account(double blance) {
        this.blance = blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public double getBlance() {
        return blance;
    }
    
    public abstract String GetAccountType();
    public void display(){
        System.out.println("AccountType: "+GetAccountType());
        System.out.println("Blance: "+getBlance());
    }


}
