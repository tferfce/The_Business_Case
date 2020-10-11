package gr.codehub.ferfelis.ass1.model.imp;

import gr.codehub.ferfelis.ass1.model.Product;
import gr.codehub.ferfelis.ass1.model.Store;

import java.util.ArrayList;
import java.util.List;

/**
 * 2nd implement of Store Interface with 2 more methods on its own Overide
 */
public class InventoryRetailStore implements Store {
    private List<Product> productList;
    private double totalBuyBalance;
    private double totalSellBalance;

    public InventoryRetailStore() {
        this.productList = new ArrayList<>();
    }

    public double getTotalBuyBalance() {
        return totalBuyBalance;
    }

    public double getTotalSellBalance() {
        return totalSellBalance;
    }

    @Override
    public void buy(Product x) {
        if (x.isAvailable()){
            x.setAvailableForSale(true);
            totalBuyBalance = totalBuyBalance + x.getPriceWhenBuy();
            this.productList.add(x);
        }
    }

    @Override
    public void sell(Product x) {
        if (x.isAvailableForSale()){
            x.setAvailableForSale(false);
            totalSellBalance = totalSellBalance + x.getPriceWhenSell();
            if (productList.indexOf(x)>=0) {
                this.productList.remove(productPosition(x));
            }
        }
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    private int productPosition(Product x){
        return this.productList.indexOf(x);
    }
    public void showInventory() {
        for (Product x: productList){
            System.out.println(x);
        }
    }
    public void clearInventory(){
        for (Product product : productList){
            product.setPriceWhenSell(product.getPriceWhenSell()-product.getPriceWhenSell() * 0.1);
            sell(product);
        }
    }


}
