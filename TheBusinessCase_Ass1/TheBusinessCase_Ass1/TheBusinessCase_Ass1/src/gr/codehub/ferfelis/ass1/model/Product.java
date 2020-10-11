package gr.codehub.ferfelis.ass1.model;

/**
 * Product Object with unique id
 */
public class Product {
    public static int id = 0;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;
    private boolean Available = true;
    private boolean AvailableForSale = false;
    private int numberOfProducts;
    private double totalProductSells;

    public static void setId(int id) {
        Product.id = id;
    }

    public double getTotalProductSells() {
        return totalProductSells;
    }

    public void setTotalProductSells(double totalProductSells) {
        this.totalProductSells = totalProductSells;
    }

    public Product(String name, double priceWhenBuy, double priceWhenSell) {
        this.numberOfProducts=0;
        this.name = name;
        this.priceWhenBuy = priceWhenBuy;
        this.priceWhenSell = priceWhenSell;
        this.totalProductSells = 0;
        id++;
    }
    public Product(String name){
        this.numberOfProducts=0;
        this.name = name;
        this.priceWhenBuy = 0;
        this.priceWhenSell = 0;
        this.totalProductSells = 0;
        id++;
    }
    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public void setPriceWhenBuy(double priceWhenBuy) {
        this.priceWhenBuy = priceWhenBuy;
    }

    public double getPriceWhenSell() {
        return priceWhenSell;
    }

    public void setPriceWhenSell(double priceWhenSell) {
        this.priceWhenSell = priceWhenSell;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        if (!available){
            setAvailableForSale(false);
        }
        Available = available;
    }

    public boolean isAvailableForSale() {
        return AvailableForSale;
    }

    public void setAvailableForSale(boolean availableForSale) {
        AvailableForSale = availableForSale;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public String toString() {
        return
                "\nname = " + name +
                "\npriceWhenBuy = " + priceWhenBuy +
                "\npriceWhenSell = " + priceWhenSell
                ;
    }
}
