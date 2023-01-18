package com.gunsoo.gunscafe.dto;


import java.util.List;

//주문 dto
//주문자
//어떤거 주문했냐? -> list???
public class OrdersDto {

    private String userId;

    //주문상품
    private List<OrdersItemDto> ordersItemList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<OrdersItemDto> getOrdersItemList() {
        return ordersItemList;
    }

    public void setOrdersItemList(List<OrdersItemDto> ordersItemList) {
        this.ordersItemList = ordersItemList;
    }

}
