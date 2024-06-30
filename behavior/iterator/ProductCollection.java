package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements IAggregate<Product> {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public IIterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
