package com.gunsoo.gunscafe.dto;

public class OrdersItemDto {

    //주문 상품 개수
    private int cnt;

    //주문아이템
    private ItemsDto items;

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public ItemsDto getItems() {
        return items;
    }

    public void setItems(ItemsDto items) {
        this.items = items;
    }

    public OrdersItemDto(int cnt, ItemsDto items) {
        this.cnt = cnt;
        this.items = items;
    }
}
