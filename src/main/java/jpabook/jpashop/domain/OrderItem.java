package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class OrderItem extends BaseEntity{

    @Id @GeneratedValue
    @Column(name="ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private jpabook.jpashop.domain.Order order;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private jpabook.jpashop.domain.Item item;

    private int orderPrice;
    private int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public jpabook.jpashop.domain.Order getOrder() {
        return order;
    }

    public void setOrder(jpabook.jpashop.domain.Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
