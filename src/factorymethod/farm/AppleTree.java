package factorymethod.farm;

import factorymethod.product.Apple;
import factorymethod.product.Product;

public class AppleTree extends Farm{
    @Override
    Product createProduct() {
        return new Apple();
    }
}
