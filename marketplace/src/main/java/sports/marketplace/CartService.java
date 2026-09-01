package sports.marketplace;
// Логика действия корзины
public class CartService {

    public CartItem cartItem;


    public void removeFromCart(User user, Long productId){
        cartItem.remove(productId);
    }

    public void updateCartItem(User user, Long productId, Integer quantity){
        cartItem.update(productId);
    }

}
