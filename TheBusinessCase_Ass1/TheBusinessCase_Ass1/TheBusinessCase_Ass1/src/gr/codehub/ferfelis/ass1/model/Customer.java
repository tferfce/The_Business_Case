package gr.codehub.ferfelis.ass1.model;

import java.util.Random;

/**
 * Customer creation
 */
public class Customer {
    private String name;
    private double totalCashPurchases;
    private double totalCreditPurchases;
    private int totalNumberOfTransactions;
    private int purchaseMethod;
    Random random = new Random();

    public Customer(String name) {
        this.name = name;
        this.totalCashPurchases = 0;
        this.totalCreditPurchases = 0;
        this.totalNumberOfTransactions = 0;
        this.purchaseMethod = random.nextInt(2);
    }

    public String getPurchaseMethod() {
        if (purchaseMethod == 0){
            return "Cash";
        }
        return "Credit";
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalCashPurchases() {
        return totalCashPurchases;
    }

    public void setTotalCashPurchases(double totalCashPurchases) {
        this.totalCashPurchases += totalCashPurchases;
    }

    public double getTotalCreditPurchases() {
        return totalCreditPurchases;
    }

    public void setTotalCreditPurchases(double totalCreditPurchases) {
        this.totalCreditPurchases += totalCreditPurchases;
    }

    public int getTotalNumberOfTransactions() {
        return totalNumberOfTransactions;
    }

    public void setTotalNumberOfTransactions(int totalNumberOfTransactions) {
        this.totalNumberOfTransactions = totalNumberOfTransactions;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "\nName = " + name +
                "\ntotalCashPurchases =" +
                totalCashPurchases +
                "\ntotalCreditPurchases = " +
                totalCreditPurchases +
                "\ntotalNumberOfTransactions = " +
                totalNumberOfTransactions +
                "\n==============";
    }
}
