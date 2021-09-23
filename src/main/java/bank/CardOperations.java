package bank;

public interface CardOperations
{
    default Card addCard(BankAccount bankAccount) {
        Card newCard = new Card(bankAccount);
        bankAccount.addCard(newCard);
        return newCard;
    }
}
