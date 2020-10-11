package gr.codehub.ferfelis.ass1.Test;

import gr.codehub.ferfelis.ass1.model.Product;
import gr.codehub.ferfelis.ass1.model.imp.SimpleRetailStore;
import gr.codehub.ferfelis.ass1.model.Store;

/**
 * Testing for SimpleRetailStore
 */
public class SimpleRetailStoreTesting {
    public static void main(String[] args) {
        Product x1 = new Product("Painting Picasso.Guernica",100,1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A",200,2000);
        Product x4 = new Product("Chair. Luis XV",100,1000);
        Store mariaStore = new SimpleRetailStore();
        x1.setAvailable(false);
        mariaStore.buy(x1);
        mariaStore.buy(x2);
        mariaStore.buy(x2);
        mariaStore.buy(x4);
        mariaStore.sell(x1);
        x4.setAvailable(false);
        mariaStore.sell(x2);
        mariaStore.sell(x4);
        System.out.println(mariaStore.getRevenue());
        mariaStore.sell(x2); //In here we can make it fail just by removing Line 23 in SimpleRetailStore
        mariaStore.sell(x2);
        mariaStore.sell(x2);
        System.out.println(mariaStore.getRevenue());
    }
}
