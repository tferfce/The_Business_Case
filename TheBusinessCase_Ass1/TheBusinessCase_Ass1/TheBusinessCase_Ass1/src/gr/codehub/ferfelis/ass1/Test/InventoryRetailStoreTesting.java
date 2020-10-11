package gr.codehub.ferfelis.ass1.Test;

import gr.codehub.ferfelis.ass1.model.imp.InventoryRetailStore;
import gr.codehub.ferfelis.ass1.model.Product;
import gr.codehub.ferfelis.ass1.model.Store;

/**
 * Testing for InventoryRetailStore
 */
public class InventoryRetailStoreTesting {
    public static void main(String[] args) {
        Product x1 = new Product("Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product("Chair. Luis XV");
        x4.setPriceWhenBuy(100);
        x4.setPriceWhenSell(1000);
        Store dismosStore = new InventoryRetailStore();
        dismosStore.buy(x1);
        dismosStore.buy(x4);
        dismosStore.sell(x1);
        System.out.println(dismosStore.getRevenue());
        dismosStore.sell(x1);
        dismosStore.sell(x2);
        x4.setAvailable(false);
        dismosStore.buy(x4);
        dismosStore.sell(x4);
        dismosStore.buy(x4);
        dismosStore.sell(x4);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
    }
}
