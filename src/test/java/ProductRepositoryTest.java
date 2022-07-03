import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {
    Product product1 = new Product(21, "Стихи1", 101);
    Product product2 = new Product(22, "Стихи2", 102);
    Product product3 = new Product(23, "Стихи3", 103);

    @Test
    public void shouldSaveProduct() {
        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.getProduct();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldRemoveProduct(){
        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.removeById(product2.getId());
        Product[] expected = {product1, product3};
        Product[] actual = repo.getProduct();
        Assertions.assertArrayEquals(expected, actual);
    }
}
