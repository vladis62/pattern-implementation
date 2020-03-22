package factorymethod.farm;

import factorymethod.product.Product;

abstract public class Farm {
    public void printName() {
        Product product = createProduct();
        product.printName();
    }
    abstract Product createProduct();
}
