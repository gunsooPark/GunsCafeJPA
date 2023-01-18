package com.gunsoo.gunscafe.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtils {

    /*
     * 원하는 타입의 오늘날짜 가져오기
     */
    public static String getDateType(String type){

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(type, Locale.KOREA);
        String today = sdf.format(date);

        return today;
    }

    public static Date getDate(){
        Date date = new Date();
        return date;
    }


}
