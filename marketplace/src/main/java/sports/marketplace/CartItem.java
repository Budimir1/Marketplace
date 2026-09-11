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
    public void add(CartItem cartItem){
        cartItems.add(cartItem); // реализация личной корзины
    }
    public double remove(double emptyShoppingCart){
        return emptyShoppingCart;
    }
    public void clear(){
        cartItems.clear(); // очистить корзину
    }
    public void updateCartItem(User user, Long productId, Integer quantity) {
        cartItems.stream()
                .filter(item -> item.getProduct().equals(productId))
                .findFirst()
                .ifPresent(item -> item.setQuantity(quantity)); // обновление корзины
    }
}
