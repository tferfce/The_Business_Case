package gr.codehub.ferfelis.ass1.model;
import gr.codehub.ferfelis.ass1.global.DeliveryStatus;
import gr.codehub.ferfelis.ass1.model.imp.InventoryRetailStore;

/**
 * Combination of Order-Store
 */
public class OrdersInventoryRetailStore extends InventoryRetailStore {
    Store store;
    Customer pointCustomer;
    Order pointOrder;
    Product pointProduct;
    private final String cash  = "Cash";

    public OrdersInventoryRetailStore() {
        this.store = new InventoryRetailStore();
    }

    public Store getStore() {
        return store;
    }

    public Order createOrder(Customer customer, Product product){
        if (product.isAvailable()) {
            Order order = new Order(product, customer, DeliveryStatus.NOT_DELIVERED);
            customer.setTotalNumberOfTransactions(customer.getTotalNumberOfTransactions() + 1);
            product.setNumberOfProducts(product.getNumberOfProducts()+1);
            setPointers(customer, product, order);
            store.buy(product);
            executeOrder();
            return order;
        }
        return null;
    }

    private void setPointers(Customer customer, Product product, Order order) {
        pointCustomer = customer;
        pointProduct = product;
        pointOrder = order;
    }

    private void executeOrder(){
        store.sell(pointProduct);
        pointProduct.setTotalProductSells(pointProduct.getTotalProductSells()+ pointProduct.getPriceWhenSell());
        pointOrder.setDeliveryStatus(DeliveryStatus.DELIVERED);
        if (pointCustomer.getPurchaseMethod().equalsIgnoreCase(cash)) {
            pointCustomer.setTotalCashPurchases(pointProduct.getPriceWhenSell());
        }else {
            pointCustomer.setTotalCreditPurchases(pointProduct.getPriceWhenSell());
        }

    }

}
