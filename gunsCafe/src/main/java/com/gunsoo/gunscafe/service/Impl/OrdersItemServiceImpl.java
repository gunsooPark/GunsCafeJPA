package com.gunsoo.gunscafe.service.Impl;

import com.gunsoo.gunscafe.model.OrdersItem;
import com.gunsoo.gunscafe.repository.OrdersItemRepository;
import com.gunsoo.gunscafe.service.OrdersItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersItemServiceImpl implements OrdersItemService {

    @Autowired
    OrdersItemRepository ordersItemRepository;


    /*
     *주문상품등록
     */
    @Override
    public int insertOrderItem(OrdersItem ordersItem) {

        int result = 1;

        try {
            ordersItemRepository.save(ordersItem);
        } catch (Exception e) {
            result = 0;
        }

        return result;
    }

    @Override
    public OrdersItem selectOrdersItem(long ordersItemId) {



        return null;
    }


}
