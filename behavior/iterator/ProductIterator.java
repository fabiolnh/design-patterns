package behavior.iterator;

import java.util.List;

public class ProductIterator implements IIterator<Product> {
    private List<Product> products;
    private int position = 0;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return position < products.size();
    }

    @Override
    public Product next() {
        if (this.hasNext()) {
            return products.get(position++);
        }
        return null;
    }
}
