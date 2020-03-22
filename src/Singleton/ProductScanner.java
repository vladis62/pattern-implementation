package Singleton;

public class ProductScanner {
    public static void main(String[] args) {
        BananaLazy myBigBanana = BananaLazy.getBanana();
        myBigBanana.setBarcode("123");
        myBigBanana.setPrice(50);
        /**
         * Создадим новый банан
         */
        BananaLazy myLittleBanana = BananaLazy.getBanana();
        System.out.println("Barcode: " + myLittleBanana.getBarcode() + ", price: " + myLittleBanana.getPrice());
    }
}
