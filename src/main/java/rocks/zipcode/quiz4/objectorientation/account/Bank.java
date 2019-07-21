package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> list;
    public Bank() {
        this.list = new ArrayList<>();
    }
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount bankAccount = list.get(indexNumber);
        list.remove(bankAccount);
        return bankAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        list.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");

    if(list.contains(bankAccount)) {
        return true;
    }
    return false;
    }
}
