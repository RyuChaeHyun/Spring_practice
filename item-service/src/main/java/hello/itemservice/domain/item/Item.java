package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // 다 할 수 있어서 위험하다 예측 없이 동작한다 조심히 쓰기
//@Getter @Setter
public class Item {

    private Long id;
    private String itemName;
    //가격과 수량이 안 들어갈 수도(null) 있기 때문에 int가 아니라 Integer
    private Integer price;
    private Integer quantity;

    public Item(){

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}
