package cleancode.minesweeper.asis;

import java.util.List;

public class Orders {
    private final List<Order> orders;

    public Orders(List<Order> orders) {
        this.orders = orders;
    }

    public long getAmountSum() {
        return orders.stream()
                .mapToLong(Order::getAmount)
                .sum();
    }

    class Order {
        private Long amount;

        public Long getAmount() {
            return amount;
        }
    }
}

