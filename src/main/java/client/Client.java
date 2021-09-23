package client;

import bank.*;

import java.util.ArrayList;
import java.util.List;

public class Client implements AccountOperations, CardOperations
{
    private String firstName;
    private String lastName;
    private String cnp;

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public Client(String firstName, String lastName, String cnp)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }

    @Override
    public BankAccount openAccount(Bank bank)
    {
        BankAccount newAccount = new BankAccount(bank, this);
        this.bankAccounts.add(newAccount);
        bank.getAccounts().add(newAccount);
        return newAccount;
    }

    @Override
    public boolean transfer(BankAccount sourceAccount, BankAccount destinationAccount, int transferAmount) {
        if (sourceAccount.withdraw(transferAmount)) {
            destinationAccount.deposit(transferAmount);
            return true;
        }
        return false;
    }

    @Override
    public void deposit(long destinationAccountNumber, int amount)
    {
        for (BankAccount currentIterationAccount : bankAccounts) {
            if (currentIterationAccount.getAccountNumber() == destinationAccountNumber) {
                currentIterationAccount.deposit(amount);
                break;
            }
        }
    }

//    public boolean transfer(BankAccount sourceAccount, BankAccount destinationAccount, int transferAmount) {
//        if (!sourceAccount.withdraw(transferAmount)) {
//            return false;
//        }
//        destinationAccount.deposit(transferAmount);
//        return true;

//    }

    @Override
    public String toString()
    {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bankAccounts=" + bankAccounts +
                '}';
    }

//    public void deposit(long destinationAccountNumber, int amount)
//    {
//        for (int i=0; i<bankAccounts.size(); i++) {
//            BankAccount currentIterationAccount = bankAccounts.get(i);
//            if (currentIterationAccount.getAccountNumber() == destinationAccountNumber) {
//                currentIterationAccount.deposit(amount);
//                break;
//            }
//        }
//    }

}
