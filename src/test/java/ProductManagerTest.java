import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product product1 = new Product(21, "Стихи1", 101);
    Product product2 = new Product(22, "Стихи2", 102);
    Product product3 = new Product(23, "Стихи3", 103);

    @BeforeEach
    public void setup(){
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
    }

    @Test
    public void shouldShowAllProduct(){
        Product[] expected = {product1, product2, product3};
        Product[] actual = manager.getProduct();
        Assertions.assertArrayEquals(expected, actual);
    }

}
