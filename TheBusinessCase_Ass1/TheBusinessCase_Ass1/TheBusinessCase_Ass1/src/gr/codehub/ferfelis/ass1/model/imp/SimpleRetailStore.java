package gr.codehub.ferfelis.ass1.model.imp;

import gr.codehub.ferfelis.ass1.model.Product;
import gr.codehub.ferfelis.ass1.model.Store;

/**
 * 1st implementation of Store interface with getRevenue as max profit for buying and selling products Created by Thomas Ferfelis 7/10/2020
 */
public class SimpleRetailStore implements Store {
    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public void buy(Product x) {
        if (x.isAvailable()){
            x.setAvailableForSale(true);
            totalBuyBalance = totalBuyBalance + x.getPriceWhenBuy();
        }
    }
    @Override
    public void sell(Product x) {
        if (x.isAvailableForSale() == true){
            x.setAvailableForSale(false);
            totalSellBalance = totalSellBalance + x.getPriceWhenSell();
        }
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    @Override
    public void clearInventory() {
    }
    @Override
    public void showInventory() {
    }

    public SimpleRetailStore() {
    }
    public double getTotalBuyBalance() {
        return totalBuyBalance;
    }
    public double getTotalSellBalance() {
        return totalSellBalance;
    }

}
