package sports.marketplace;
// логика юзера
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class    User implements UserDetails {

    public Order order; // Заказ
    private Long id; // id юзера
    private String email; // почта пользователя
    private String password; // пароль пользователя
    private Role role; // роль пользлователя

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_" + role.name())); // определение роли пользователя
    }

    @Override
    public String getUsername() {
        return email; // возвращает почту
    }

    @Override
    public boolean isAccountNonExpired() { return true; } // проверка акаунта на существование

    @Override
    public boolean isAccountNonLocked() { return true; } // проверка блокировки аккаунта

    @Override
    public boolean isCredentialsNonExpired() { return true; } // покупательная способность

    @Override
    public boolean isEnabled() { return true; } // доступность

    private List <CartItem> cartItems = new ArrayList<>(); //личная корзина
    public void add(Long id, User user, Product product, Integer quantity){
        CartItem newItem = CartItem.builder()
                .user(this)
                .product(product)
                .quantity(quantity)
                .build();
        cartItems.add(newItem); // реализация личной корзины
    }

    public void remove(Long productId){
        cartItems.removeIf(item -> item.getProduct().equals(productId)); // удаление из корзины
    }

    public void updateCartItem(User user, Long productId, Integer quantity) {
        cartItems.stream()
                .filter(item -> item.getProduct().equals(productId))
                .findFirst()
                .ifPresent(item -> item.setQuantity(quantity)); // обновление корзины
    }

    public void clear(){
        cartItems.clear(); // очистить корзину
    }
}
