package gr.codehub.ferfelis.ass1.model;

/**
 * Store interface with 2 Implementations
 */
public interface Store {
    void buy(Product x);
    void sell(Product x);
    double getRevenue();
    void clearInventory();
    void showInventory();
    double getTotalSellBalance();
    double getTotalBuyBalance();

}
