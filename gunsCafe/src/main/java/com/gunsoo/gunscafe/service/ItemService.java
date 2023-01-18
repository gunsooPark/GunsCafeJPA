package com.gunsoo.gunscafe.service;

import com.gunsoo.gunscafe.dto.ItemsDto;
import com.gunsoo.gunscafe.model.Items;

public interface ItemService {

    public void insertItem(Items items);
    public ItemsDto selectItem(long itemId);
    public boolean checkItem(long itemId);
}
