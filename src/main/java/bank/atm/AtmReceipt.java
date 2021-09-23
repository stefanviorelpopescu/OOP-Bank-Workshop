package bank.atm;

public class AtmReceipt
{
    public static final String SUCCESS_MESSAGE = "Great Success!";
    public static final String ERROR_MESSAGE = "Oh, snap!";

    private final String message;

    public AtmReceipt(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "AtmReceipt{" +
                "message='" + message + '\'' +
                '}';
    }
}
