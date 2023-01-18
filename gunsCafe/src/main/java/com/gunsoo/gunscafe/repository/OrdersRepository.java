package com.gunsoo.gunscafe.repository;

import com.gunsoo.gunscafe.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

//    @Query(value = "SELECT * FROM Items WHERE Items.items_id = ?", nativeQuery = true)
//    Items findByItemId(Long itemId);

}
