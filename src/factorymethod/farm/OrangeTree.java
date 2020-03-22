package factorymethod.farm;

import factorymethod.product.Orange;
import factorymethod.product.Product;

public class OrangeTree extends Farm {
    @Override
    Product createProduct() {
        return new Orange();
    }
}
