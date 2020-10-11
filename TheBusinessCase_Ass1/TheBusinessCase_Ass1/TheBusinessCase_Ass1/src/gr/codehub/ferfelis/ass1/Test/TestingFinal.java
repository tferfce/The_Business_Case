package gr.codehub.ferfelis.ass1.Test;
import gr.codehub.ferfelis.ass1.model.Customer;
import gr.codehub.ferfelis.ass1.model.OrdersInventoryRetailStore;
import gr.codehub.ferfelis.ass1.model.Product;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static gr.codehub.ferfelis.ass1.global.Methods.*;


/**
 * Final Testing of the Project with the help of global/Methods
 */
public class TestingFinal {
    public static void main(String[] args) throws IOException {
        OrdersInventoryRetailStore ordersInventoryRetailStore = new OrdersInventoryRetailStore();
        Customer customer = new Customer("Thomas");
        Customer customer1 = new Customer("Maria");
        Product x1 = new Product("Painting Picasso.Guernica",100,1000);
        Product x2 = new Product("Painting Picasso",100,2000);
        ordersInventoryRetailStore.createOrder(customer1,x2);
        ordersInventoryRetailStore.createOrder(customer1,x2);
        ordersInventoryRetailStore.createOrder(customer,x1);
        x2.setAvailable(false);
        ordersInventoryRetailStore.createOrder(customer,x2);
        customerTotalPurchases.add(customer);
        customerTotalPurchases.add(customer1);
        productsTotalNumber.add(x1);
        productsTotalNumber.add(x2);
        FileIO(customer, customer1, x1, x2);
    }

    private static void FileIO(Customer customer, Customer customer1, Product x1, Product x2) throws IOException {
        File file = new File("output.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Number of Transactions for Customer 1 = " +transactionsPerCustomer(customer1));
        pw.println("Number of Transactions for Customer = "+transactionsPerCustomer(customer));
        pw.println("Transactions Of Product x2 = "+ x2.getNumberOfProducts());
        pw.println("Total Cost Of product x2 = "+ x2.getTotalProductSells());
        pw.println("Transactions Of Product x1 = "+ x1.getNumberOfProducts());
        pw.println("Total Cost Of product x1 = "+ x1.getTotalProductSells());
        pw.println("Total Purchases of Customer 1 = "+purchasesPerCustomer(customer1));
        pw.println("Total Purchases of Customer = "+purchasesPerCustomer(customer));
        pw.println("Total Purchases of ALL Customers = "+ totalCustomersPurchases(customerTotalPurchases));
        pw.println("Total Number of Sold Products = "+totalNumberOfProducts(productsTotalNumber));
        pw.println("Total Number of Transactions For ALL Customers = "+totalCustomersTransactions(customerTotalPurchases));
        pw.println("Total Balance of Sold Products = "+balanceOfAllProducts(productsTotalNumber));
        pw.close();
    }

}
