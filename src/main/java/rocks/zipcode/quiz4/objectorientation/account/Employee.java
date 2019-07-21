package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{
    private BankAccount bankAccount;
    private Double hourlyWage;
    private Double hoursWorked;

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {

        return this.bankAccount.getBalance();
    }
    public Employee() {
        this.bankAccount = new BankAccount();
        this.hourlyWage = 35d;
        this.hoursWorked = 0d;

    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hourlyWage = 35d;
        this.hoursWorked = 0d;
    }

    public BankAccount getBankAccount() {

        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }



    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.hoursWorked * this.hourlyWage;
    }
}
