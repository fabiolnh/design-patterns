package behavior.iterator;

public class Main {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.addProduct(new Product("Laptop"));
        productCollection.addProduct(new Product("Smartphone"));
        productCollection.addProduct(new Product("Tablet"));

        IIterator<Product> iterator = productCollection.createIterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Product: " + product.getName());
        }
    }
}
