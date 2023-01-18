package com.gunsoo.gunscafe.restcontroller;

import com.gunsoo.gunscafe.dto.ItemsDto;
import com.gunsoo.gunscafe.exception.DefaultException;
import com.gunsoo.gunscafe.exception.ItemNulltException;
import com.gunsoo.gunscafe.model.Items;
import com.gunsoo.gunscafe.service.ItemService;
import com.gunsoo.gunscafe.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    ItemService itemService;

    /*
     * 아이템 최초 등록
     */
    @PostMapping("/insert")
    public ResponseEntity<Map<String, Object>> insertItem(@RequestBody List<Items> list){

        final String API_ID = "insertItem";
        Map<String, Object> resultMap = new HashMap<>();

        try {
            for(Items items : list){
                //아이템 등록할시 중복체크???

                itemService.insertItem(items);
            }
        }catch (Exception e){
            throw new DefaultException(API_ID, resultMap);
        }

        return ResponseUtils.commonResponse(API_ID,resultMap, HttpStatus.OK);

    }

    /*
     * 아이템 다중 조회
     */
    @PostMapping("/select")
    public ResponseEntity<Map<String, Object>> selectItem(@RequestBody List<ItemsDto> list){

        final String API_ID = "selectItem";
        Map<String, Object> resultMap = new HashMap<>();
        List<ItemsDto> itemsList = new ArrayList<>();

        try {
            for(ItemsDto items : list){

                Boolean checkItem = itemService.checkItem(items.getId());

                if(!checkItem){
                    throw new ItemNulltException(API_ID,resultMap);
                }

                ItemsDto resultItme = itemService.selectItem(items.getId());

                itemsList.add(resultItme);
            }

            resultMap.put("itemList", itemsList);

        }catch (ItemNulltException itemNulltException){
            throw itemNulltException;
        }catch (Exception e){
            throw new DefaultException(API_ID, resultMap);
        }

        return ResponseUtils.commonResponse(API_ID,resultMap,HttpStatus.OK);
    }


}
