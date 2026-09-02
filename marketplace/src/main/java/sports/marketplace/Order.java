package sports.marketplace;

public class Order {
    public void add(){
        Product product = new Product(
                1L,
                "creatine",
                334,
                4,
                "Моногидрат креатина для увеличения силы",
                "Спортивное питание",
                "Optimum Nutrition"
        ); //создание продукта

        CartItem cartItem = new CartItem(); // создание личной корзины

        product.getProductCatalog();

        System.out.println(cartItem.getUser());
        System.out.println(cartItem.getProduct());
        System.out.println(cartItem.getQuantity());
    }
}
