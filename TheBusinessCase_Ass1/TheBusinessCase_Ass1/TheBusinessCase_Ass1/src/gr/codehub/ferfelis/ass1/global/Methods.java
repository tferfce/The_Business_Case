package gr.codehub.ferfelis.ass1.global;

import gr.codehub.ferfelis.ass1.model.Customer;
import gr.codehub.ferfelis.ass1.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Methods + Lists to implement Step 8 of the assignment used in Test/TestingFinal
 */
public class Methods
{
    public static List<Customer> customerTotalPurchases = new ArrayList<>();
    public static List<Product> productsTotalNumber = new ArrayList<>();

    public static double purchasesPerCustomer(Customer customer){
        return customer.getTotalCashPurchases()+customer.getTotalCreditPurchases();
    }

    public static int transactionsPerCustomer(Customer customer){
        return customer.getTotalNumberOfTransactions();
    }

    public static double totalCustomersPurchases(List<Customer> customers){
        int total = 0;
        for (Customer customer: customers){
            total+=customer.getTotalCashPurchases()+ customer.getTotalCreditPurchases();
        }
        return total;
    }

    public static int totalCustomersTransactions(List<Customer> customers){
        int numberOfTransactions = 0;
        for (Customer customer: customers){
            numberOfTransactions += customer.getTotalNumberOfTransactions();
        }
        return numberOfTransactions;
    }
    public static int totalNumberOfProducts(List<Product> products){
        int number = 0;
        for (Product x: products){
            number += x.getNumberOfProducts();
        }
        return number;
    }
    public static double balanceOfAllProducts(List<Product> products){
        double total = 0;
        for (Product x: products){
            total += x.getTotalProductSells();
        }
        return total;
    }
}
