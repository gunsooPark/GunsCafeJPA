package com.gunsoo.gunscafe.handler;

import com.gunsoo.gunscafe.exception.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptHandler extends ResponseEntityExceptionHandler {

    /*
     * 기본 예외처리
     */
    @ExceptionHandler(DefaultException.class)
    public Map<String, Object> defaultHandler(DefaultException ex){

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("id", ex.getApi_id());
        resultMap.put("code" , "500");
        resultMap.put("message" , "오류가 발생하였습니다.");
        resultMap.put("result", ex.getResultMap());

        return resultMap;
    }

    /*
     * 회원 중복 예외처리
     */
    @ExceptionHandler(DuplicateException.class)
    public Map<String, Object> duplicateHandler(DuplicateException ex){

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("id", ex.getApi_id());
        resultMap.put("code" , "423");
        resultMap.put("message" , "아이디 중복 에러");
        resultMap.put("result", ex.getResultMap());

        return resultMap;
    }

    /*
     * 사용자 예외처리
     */
    @ExceptionHandler(UserNulltException.class)
    public Map<String, Object> userNullHandler(UserNulltException ex){

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("id", ex.getApi_id());
        resultMap.put("code" , "204");
        resultMap.put("message" , "사용자의 정보가 없습니다.");
        resultMap.put("result", ex.getResultMap());

        return resultMap;
    }

    /*
     * 아이템 예외처리
     */
    @ExceptionHandler(ItemNulltException.class)
    public Map<String, Object> itemNullHandler(ItemNulltException ex){

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("id", ex.getApi_id());
        resultMap.put("code" , "204");
        resultMap.put("message" , "아이템의 정보가 없습니다.");
        resultMap.put("result", ex.getResultMap());

        return resultMap;
    }

    /*
     * 주문 예외처리
     */
    @ExceptionHandler(OrderException.class)
    public Map<String, Object> orderHandler(OrderException ex){

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("id", ex.getApi_id());
        resultMap.put("code" , "500");
        resultMap.put("message" , "주문시 오류가 발생하였습니다.");
        resultMap.put("result", ex.getResultMap());

        return resultMap;
    }



}
