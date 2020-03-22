package Singleton;

public class BananaLazy {
    private double price;
    private String barcode;
    private static BananaLazy banana;

    public static synchronized BananaLazy getBanana() {
        if(banana == null) {
            banana = new BananaLazy();
        }
        return banana;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
