package sports.marketplace;
// Логика действия корзины
public class CartService {

    public CartItem cartItem;

    public void add(Long id, User user, Integer quantity, Product product){
        CartItem newItem = CartItem.builder()
                .id(id)
                .user(user)
                .product(product)
                .quantity(quantity)
                .build();
        cartItem.add(newItem); // реализация личной корзины
    }
    public void clear(){
        cartItem.clear(); // очистить корзину
    }
    public void removeFromCart(User user, Long productId){
        cartItem.remove(productId);
    }

    public void updateCartItem(User user, Long productId, Integer quantity){
        cartItem.updateCartItem(user, productId, quantity);
    }

}
