import bank.Bank;
import bank.BankAccount;
import bank.Card;
import bank.atm.Atm;
import client.Client;

public class Main
{
    public static void main(String[] args)
    {
        Bank ingBank = new Bank("ROINGB", "ING Romania");
        Bank bcrBank = new Bank("ROBCRO", "BCR Romania");

        Client denisa = new Client("Denisa", "Socaciu", "2980101123456");
        BankAccount denisaAccount = denisa.openAccount(ingBank);
        denisaAccount.deposit(1000);

        Client vlad = new Client("Vlad", "Suciu", "1980101123456");
        BankAccount vladAccount = vlad.openAccount(bcrBank);
        vlad.deposit(vladAccount.getAccountNumber(), 1000);

        System.out.println(denisa);
        System.out.println(vlad);

        vlad.transfer(vladAccount, denisaAccount, 150);

        System.out.println(denisa);
        System.out.println(vlad);

        Atm ingAtm = new Atm(ingBank);
        Card denisaCard = denisa.addCard(denisaAccount);

        System.out.println(ingAtm.atmWithdraw(denisaCard, 2000));
        System.out.println(ingAtm.atmDeposit(denisaCard, 850));
        System.out.println(ingAtm.atmWithdraw(denisaCard, 1500));

    }
}
