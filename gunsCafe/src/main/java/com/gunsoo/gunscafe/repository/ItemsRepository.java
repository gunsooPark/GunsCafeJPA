package com.gunsoo.gunscafe.repository;

import com.gunsoo.gunscafe.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemsRepository extends JpaRepository<Items, Long> {

    @Query(value = "SELECT * FROM Items WHERE Items.items_id = ?", nativeQuery = true)
    Items findByItemId(Long itemId);

}
