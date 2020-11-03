package Exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {

    }

    public Account(int id, double initialBalance){
        this.id = id;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        System.out.println("The balance is " + balance + "\n");
        return balance;
    }

    public double getAnnualInterestRate(double ir) {
        annualInterestRate = ir;
        return annualInterestRate;
    }

    public Date getDateCreated() {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy, EEE");
        Date dateCreated = new Date();
        //System.out.println(d);
        System.out.println("The account is created at " + sd.format(dateCreated));
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyIR = (annualInterestRate / 100) / 12 ;
        return monthlyIR;
    }
    public double getMonthlyInterest() {
        double monthlyInterest = balance * getMonthlyInterestRate();
        System.out.println("The monthly interest is " + monthlyInterest);
        return monthlyInterest;
    }

    public void withdraw(double amount) {
       if(balance < amount) {
           System.out.println("The balance is not enough to withdraw");
           System.out.println("Balance : " + balance);
       }else if (balance >= amount)
          balance -= amount;
          // System.out.println("The balance is " + balance);

    }

    public void deposit(double amount) {
        balance += amount;

        //System.out.println("The balance is " + balance);
    }
}
