package gr.codehub.ferfelis.ass1.Test;

import gr.codehub.ferfelis.ass1.model.Customer;

/**
 * assert Testing for Customer Object
 */
public class CustomerTesting {
    public static void main(String[] args) {
        Customer customer = new Customer("Thomas");
        try {
            assert customer.getName().equals("Thomas");
            assert customer.getTotalCashPurchases() == 1 ;
            assert customer.getTotalNumberOfTransactions()==0;
            assert customer.getTotalCreditPurchases()==0;
            System.out.println("Passed Testing".toUpperCase());
        } catch (AssertionError e){
            e.printStackTrace();
            System.out.println("Failed Testing".toUpperCase());
        }finally {
            System.out.println("================");
            System.out.println("Testing finished");
        }

    }
}
