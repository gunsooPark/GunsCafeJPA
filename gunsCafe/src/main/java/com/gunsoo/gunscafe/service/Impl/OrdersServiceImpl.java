package com.gunsoo.gunscafe.service.Impl;

import com.gunsoo.gunscafe.dto.ItemsDto;
import com.gunsoo.gunscafe.dto.OrdersDto;
import com.gunsoo.gunscafe.dto.OrdersItemDto;
import com.gunsoo.gunscafe.dto.UsersDto;
import com.gunsoo.gunscafe.model.Orders;
import com.gunsoo.gunscafe.model.OrdersItem;
import com.gunsoo.gunscafe.repository.OrdersRepository;
import com.gunsoo.gunscafe.service.ItemService;
import com.gunsoo.gunscafe.service.OrdersService;
import com.gunsoo.gunscafe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    UserService userService;

    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    ItemService itemService;

    /*
     * 주문 등록
     * */
    @Override
    public void insertOrders(OrdersDto ordersDto) {

        List<OrdersItem> ordersItemslist = new ArrayList<>();

        String userId =ordersDto.getUserId();
        List<OrdersItemDto> orderslist = ordersDto.getOrdersItemList();


        //주문고객
        UsersDto user = userService.selectUser(userId);

        for(int i=0; i<orderslist.size(); i++){
            long itemId = orderslist.get(i).getItems().getId() ;
            int cnt = orderslist.get(i).getCnt();

            ItemsDto item = itemService.selectItem(itemId);
            ordersItemslist.add(OrdersItem.createOrdersItem(item,cnt));
        }

        Orders orders = new Orders(UsersDto.toEntity(user), ordersItemslist);

        ordersRepository.save(orders);

    }
}
