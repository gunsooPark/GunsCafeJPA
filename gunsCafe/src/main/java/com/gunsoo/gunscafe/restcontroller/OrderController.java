package com.gunsoo.gunscafe.restcontroller;

import com.gunsoo.gunscafe.dto.OrdersDto;
import com.gunsoo.gunscafe.exception.OrderException;
import com.gunsoo.gunscafe.service.OrdersService;
import com.gunsoo.gunscafe.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrdersService ordersService;

    /*
     * 주문
     */
    @PostMapping("/insert")
    public ResponseEntity<Map<String, Object>> insertOrder(@RequestBody OrdersDto ordersDto){

        final String API_ID = "insert_order";
        Map<String, Object> resultMap = new HashMap<>();

        try {

            ordersService.insertOrders(ordersDto);

        }catch (Exception e){
            throw new OrderException(API_ID, resultMap);
        }

        return ResponseUtils.commonResponse(API_ID,resultMap, HttpStatus.OK);
    }

    /*
     * 주문 빌지 아직 안함
     */
//    @PostMapping("/select")
//    public ResponseEntity<Map<String, Object>> selectOrder(){
//
//        String api_id = "select_order";
//        Map<String, Object> resultMap = new HashMap<>();
//
//
//
//        return ResponseUtils.commonResponse(api_id,resultMap,HttpStatus.OK);
//    }

}
