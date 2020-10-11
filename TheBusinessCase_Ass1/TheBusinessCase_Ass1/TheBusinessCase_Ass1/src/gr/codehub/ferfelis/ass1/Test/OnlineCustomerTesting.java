package gr.codehub.ferfelis.ass1.Test;
import gr.codehub.ferfelis.ass1.global.customerCategory;
import gr.codehub.ferfelis.ass1.model.OnlineCustomer;

/**
 * assert Testing for child class OnlineCustomeTesting
 */
public class OnlineCustomerTesting {
    public static void main(String[] args) {
        OnlineCustomer onlineCustomer = new OnlineCustomer("Thomas","severous", customerCategory.GOVERNMENT);
        try {
            assert (onlineCustomer.getName().equals("Thomas"));
            assert (onlineCustomer.getTotalCashPurchases()==0);
            assert (onlineCustomer.getTotalCreditPurchases()==0);
            assert (onlineCustomer.getTotalNumberOfTransactions()==0);
            assert (onlineCustomer.getUsername().equals("severous"));
            assert (onlineCustomer.getCustomerCategory() == customerCategory.GOVERNMENT);
            System.out.println("Testing Passed");
        }catch (AssertionError e){
            e.printStackTrace();
            System.out.println("Testing Failed");
        }finally {
            System.out.println("Testing Finished");
        }
    }
}
