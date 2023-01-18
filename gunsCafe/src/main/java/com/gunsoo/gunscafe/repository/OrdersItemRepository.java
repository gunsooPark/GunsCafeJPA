package com.gunsoo.gunscafe.repository;

import com.gunsoo.gunscafe.model.OrdersItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersItemRepository extends JpaRepository<OrdersItem, Long>  {

}
