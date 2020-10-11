package gr.codehub.ferfelis.ass1.model;
import gr.codehub.ferfelis.ass1.global.DeliveryStatus;
import java.util.Date;

/**
 * Order Object used to Combine Product-Customer
 */
public class Order {
    private Product product;
    private Customer customer;
    private Date date = new Date();
    private DeliveryStatus deliveryStatus;

    public Order(Product product, Customer customer, DeliveryStatus deliveryStatus) {
        this.product = product;
        this.customer = customer;
        this.deliveryStatus = deliveryStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "=======Order=======".toUpperCase() +
                "\nProduct" + product +"\n"+
                "\n" + customer +
                "\nDATE = " + date +
                "\ndeliveryStatus = " + deliveryStatus;
    }
}
