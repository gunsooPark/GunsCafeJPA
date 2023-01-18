package com.gunsoo.gunscafe.service.Impl;

import com.gunsoo.gunscafe.dto.ItemsDto;
import com.gunsoo.gunscafe.model.Items;
import com.gunsoo.gunscafe.repository.ItemsRepository;
import com.gunsoo.gunscafe.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemsRepository itemRepository;

    /*
     *상품등록
     */
    @Override
    public void insertItem(Items items) {

        itemRepository.save(items);

    }

    /*
     *상품정보 가져오기
     */
    @Override
    public ItemsDto selectItem(long itemId) {

        Items items = itemRepository.findByItemId(itemId);

        return ItemsDto.from(items);
    }

    /*
     *상품 유무 체크
     * 존재 true
     * x : false
     */
    @Override
    public boolean checkItem(long itemId) {

        Items items = itemRepository.findByItemId(itemId);

        if(items==null){
            return false;
        }

        return true;
    }







}
