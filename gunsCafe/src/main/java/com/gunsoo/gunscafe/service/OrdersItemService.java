package com.gunsoo.gunscafe.service;

import com.gunsoo.gunscafe.model.OrdersItem;

public interface OrdersItemService {

    public int insertOrderItem(OrdersItem ordersItem);
    public OrdersItem selectOrdersItem(long ordersItemId);

}
