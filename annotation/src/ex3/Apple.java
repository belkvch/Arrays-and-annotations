package ex3;

import java.math.BigDecimal;

public enum Apple {
    Jonathan(BigDecimal.valueOf(10.5)),
    GoldenDel(BigDecimal.valueOf(9.5)),
    RedDel(BigDecimal.valueOf(5)),
    Winesap(BigDecimal.valueOf(15)),
    Cortland(BigDecimal.valueOf(8.5));

    private BigDecimal price;

    Apple(BigDecimal price) {
        this.price = price;
    }

    BigDecimal getPrice() {
        return price;
    }
}
