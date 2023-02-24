package Java_oops_continued.task7;

import java.util.Scanner;

class Customer
{
    private double Balance;
    public void setBalance(double Balance)
    {
        this.Balance = Balance;
    }
    public double getBalance()
    {

        return Balance;
    }
}

public class BankingSystem
{
    public static void main(String args[])
    {
        Customer customer1 = new Customer();
        double Balance=18000;
        customer1.setBalance(Balance);
        System.out.println("The account balance of the customer is: "+customer1.getBalance());
    }
}
