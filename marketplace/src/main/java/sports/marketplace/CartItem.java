package sports.marketplace;

import lombok.*;
import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItem {
    public Long id; // id товара
    public User user; // пользователь
    public Product product; // продукт
    public Integer quantity; //количество товара

    public double getSubTotal(double totalSum){
        totalSum = quantity * product.price;
        return totalSum;
    }

    public void setQuantity(Integer quantityProduct){
        quantity = quantityProduct;
    }

    private List<CartItem> cartItems = new ArrayList<>(); //личная корзина
    public void add(Long id, User user, Integer quantity, Product product){
        CartItem newItem = CartItem.builder()
                .id(this.getId())
                .user
                .quantity
                .product
                .build();
        cartItems.add(newItem); // реализация личной корзины
    }
    public double remove(double emptyShoppingCart){
        return emptyShoppingCart;
    }

    public double update(double updateCartItem){
        return updateCartItem;
    }

    public void clear(){
        cartItems.clear(); // очистить корзину
    }
}
