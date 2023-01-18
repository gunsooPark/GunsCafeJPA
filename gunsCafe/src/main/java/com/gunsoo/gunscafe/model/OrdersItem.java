package com.gunsoo.gunscafe.model;

import com.gunsoo.gunscafe.dto.ItemsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "OrdersItem")
public class OrdersItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordersItem_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orders_id")
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "items_id")
    private Items items;

    @Column(nullable = false)
    private int cnt;

    public static OrdersItem createOrdersItem(ItemsDto item, int cnt){
        return OrdersItem.builder()
                .items(ItemsDto.toEntity(item))
                .cnt(cnt)
                .build();
    }
}
