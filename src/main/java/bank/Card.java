package bank;

import org.apache.commons.math3.random.RandomDataGenerator;
import util.Generators;

public class Card
{
    private long cardNumer;
    private BankAccount bankAccount;

    public Card(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
        this.cardNumer = Generators.getGeneratedLong();
    }

//    private long getGeneratedLong()
//    {
//        long leftLimit = 10_000_000L;
//        long rightLimit = 99_000_000L;
//        return new RandomDataGenerator().nextLong(leftLimit, rightLimit);
//    }

    public BankAccount getBankAccount()
    {
        return bankAccount;
    }
}
