package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount implements Transactable{

    Double balance;
    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy < 0) {
            throw new IllegalArgumentException();
        }
        balance += amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
       if(amountToDecreaseBy <= 0) {
            throw new IllegalArgumentException();
        }
       else if(balance > amountToDecreaseBy) {
            balance-=amountToDecreaseBy;
       }
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }


}
