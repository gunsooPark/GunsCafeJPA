package com.gunsoo.gunscafe.exception;

import java.util.Map;

public class UserNulltException extends RuntimeException{

    private String api_id;

    private Map<String, Object> resultMap;

    public UserNulltException(String api_id, Map<String, Object> resultMap) {
        this.api_id = api_id;
        this.resultMap = resultMap;
    }

    public String getApi_id() {
        return api_id;
    }

    public void setApi_id(String api_id) {
        this.api_id = api_id;
    }

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }
}
