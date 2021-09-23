package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank
{
    private String bic;
    private String name;
    private List<BankAccount> accounts = new ArrayList<>();

    public Bank(String bic, String name)
    {
        this.bic = bic;
        this.name = name;
    }

    public String getBic()
    {
        return bic;
    }

    public List<BankAccount> getAccounts()
    {
        return accounts;
    }

    @Override
    public String toString()
    {
        return "Bank{" +
                "bic='" + bic + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
