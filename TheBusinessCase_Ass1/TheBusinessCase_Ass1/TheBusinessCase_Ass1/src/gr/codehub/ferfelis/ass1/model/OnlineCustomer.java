package gr.codehub.ferfelis.ass1.model;
import gr.codehub.ferfelis.ass1.global.customerCategory;

/**
 * Child class With Extra Fields and 2 Overrides depending on enum field
 */
public class OnlineCustomer extends Customer {
    private String username;
    private customerCategory customerCategory;
    private final double BUSINESS_DISCOUNT = 0.2;
    private final double GOVERNMENT_DISCOUNT = 0.3;
    private final double CREDIT_CARD_DISCOUNT = 0.5;

    public OnlineCustomer(String name, String username, customerCategory customerCategory) {
        super(name);
        this.username = username;
        this.customerCategory = customerCategory;
    }

    public OnlineCustomer() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public customerCategory getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(customerCategory customerCategory) {
        this.customerCategory = customerCategory;
    }

    @Override
    public double getTotalCashPurchases() {
        switch (this.customerCategory){
            case BUSINESS:
                return super.getTotalCashPurchases() - (super.getTotalCashPurchases()* BUSINESS_DISCOUNT);
            case GOVERNMENT:
                return super.getTotalCashPurchases() - (super.getTotalCashPurchases()* GOVERNMENT_DISCOUNT);
            default:
                return super.getTotalCashPurchases();
        }
    }

    @Override
    public double getTotalCreditPurchases() {
        switch (customerCategory){
            case BUSINESS:
                return super.getTotalCreditPurchases() - (super.getTotalCreditPurchases()* BUSINESS_DISCOUNT * CREDIT_CARD_DISCOUNT);
            case INDIVIDUAL:
                return super.getTotalCreditPurchases() - (super.getTotalCreditPurchases()* CREDIT_CARD_DISCOUNT);
            default:
                throw new NullPointerException("Access Denied");
        }
    }
}
