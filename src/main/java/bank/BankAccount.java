package bank;

import client.Client;
import org.apache.commons.math3.random.RandomDataGenerator;
import util.Generators;

import java.util.ArrayList;
import java.util.List;

public class BankAccount
{
    private long accountNumber;
    private String iban;
    private int balance;
    private Bank bank;
    private Client client;

    private List<Card> attachedCards = new ArrayList<>();

    public BankAccount(Bank bank, Client client)
    {
        this.bank = bank;
        this.client = client;
        this.accountNumber = Generators.getGeneratedLong();
        this.iban = bank.getBic() + accountNumber;
        this.balance = 0;
    }

//    private long getGeneratedLong()
//    {
//        long leftLimit = 10_000_000L;
//        long rightLimit = 99_000_000L;
//        return new RandomDataGenerator().nextLong(leftLimit, rightLimit);
//    }

    public int getBalance()
    {
        return balance;
    }

//    public boolean withdraw(int amount) {
//        if (this.balance >= amount) {
//            this.balance -= amount;
//            return true;
//        }
//        return false;
//    }

    public boolean withdraw(int amount) {
        if (this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public void addCard(Card cardToAttach) {
        attachedCards.add(cardToAttach);
    }

    @Override
    public String toString()
    {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", iban='" + iban + '\'' +
                ", balance='" + balance + '\'' +
                ", bank=" + bank +
                '}';
    }
}
