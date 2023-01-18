package com.gunsoo.gunscafe.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder(access = AccessLevel.PRIVATE)
@Table(name = "Orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    List<OrdersItem> ordersItems;

    @Column
    private int totalPrice;

    @Column(nullable = false, length = 50)
    private LocalDateTime orderDate;


    //생성자
    public Orders(Users users, List<OrdersItem> ordersItems) {
        this.users = users;
        this.ordersItems = setOrderItem(ordersItems);
        this.totalPrice = totalPrice(ordersItems);
        this.orderDate = LocalDateTime.now();
    }

    //연관관계 메소드 - 신님
    //어떻게 이해는 잘 안감..
    private List<OrdersItem> setOrderItem(List<OrdersItem> ordersItems){
        System.out.println("테스트" + this.getClass().getName());
        for (OrdersItem ordersItem : ordersItems) {
            ordersItem.setOrders(Orders.this);
        }
        return ordersItems;
    }

    //총가격
    private static int totalPrice(List<OrdersItem> ordersItems) {
        int resultPrice = 0;

        for(OrdersItem item : ordersItems){
            resultPrice += item.getItems().getPrice();
        }

        return resultPrice;
    }


}
