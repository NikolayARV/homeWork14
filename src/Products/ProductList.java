package Products;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Products> products = new HashSet<>();

    public void add(Products product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть");

        }
        products.add(product);
    }

    public void remove(Products product) {
        products.remove(product);
    }
}
