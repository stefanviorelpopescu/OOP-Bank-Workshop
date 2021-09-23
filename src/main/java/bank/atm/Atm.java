package bank.atm;

import bank.Bank;
import bank.Card;
import util.Generators;

public class Atm
{
    private long id;
    private Bank bank;

    public Atm(Bank bank)
    {
        this.bank = bank;
        this.id = Generators.getGeneratedLong();
    }

    public AtmReceipt atmDeposit(Card card, int amount) {
        card.getBankAccount().deposit(amount);
        return new AtmReceipt(AtmReceipt.SUCCESS_MESSAGE);
    }

    public AtmReceipt atmWithdraw(Card card, int amount){
        if (card.getBankAccount().withdraw(amount)) {
            return new AtmReceipt(AtmReceipt.SUCCESS_MESSAGE);
        }
        return new AtmReceipt(AtmReceipt.ERROR_MESSAGE);
    }
}
