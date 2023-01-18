package com.gunsoo.gunscafe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtils {

    public static ResponseEntity<Map<String,Object>> commonResponse(String api_id, Map<String,Object> resultMap, HttpStatus status){

        Map<String, Object> returnMap = new HashMap<>();

        returnMap.put("id", api_id);
        returnMap.put("code", "200");
        returnMap.put("message", "성공");
        returnMap.put("result", resultMap);

        return new ResponseEntity<>(returnMap, status);
    }


}
