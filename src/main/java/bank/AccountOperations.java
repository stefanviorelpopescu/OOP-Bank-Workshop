package bank;

public interface AccountOperations
{
    BankAccount openAccount(Bank bank);

    boolean transfer(BankAccount sourceAccount, BankAccount destinationAccount, int transferAmount);

    void deposit(long destinationAccountNumber, int amount);
}
