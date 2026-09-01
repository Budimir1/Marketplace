package sports.marketplace;

import lombok.*;

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

    public double remove(double emptyShoppingCart){
        return emptyShoppingCart;
    }

    public double update(double updateCartItem){
        return updateCartItem;
    }
}
