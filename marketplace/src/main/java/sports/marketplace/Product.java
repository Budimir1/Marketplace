package sports.marketplace;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Builder;

import java.util.HashMap;

@Builder
public class Product {
    public Long id;
    public String name;
    public double price;
    public int stock;
    public String description;
    public String category;
    public String brand;


    public static HashMap<Long, Product> getProductCatalog() {
        HashMap<Long, Product> products = new HashMap<>();

        Product creatine = Product.builder()
                .id(1L)
                .name("Креатин")
                .price(800.0)
                .stock(100)
                .description("Моногидрат креатина для увеличения силы")
                .category("Спортивное питание")
                .brand("Optimum Nutrition")
                .build();

        Product protein = Product.builder()
                .id(2L)
                .name("Протеин")
                .price(1200.0)
                .stock(50)
                .description("Сывороточный протеин для роста мышц")
                .category("Спортивное питание")
                .brand("Gold Standard")
                .build();

        Product glutamine = Product.builder()
                .id(3L)
                .name("L-Глютамин")
                .price(550.0)
                .stock(200)
                .description("Поддерживает иммунитет и восстановление")
                .category("Спортивное питание")
                .brand("NOW Sports")
                .build();

        Product zma = Product.builder()
                .id(4L)
                .name("ZMA")
                .price(500.0)
                .stock(150)
                .description("Цинк, магний и витамин B6 для сна и восстановления")
                .category("Спортивное питание")
                .brand("Optimum Nutrition")
                .build();

        products.put(creatine.getId(), creatine);
        products.put(protein.getId(), protein);
        products.put(glutamine.getId(), glutamine);
        products.put(zma.getId(), zma);

        return products;
    }

    private Long getId() {
        return id;
    }
}
