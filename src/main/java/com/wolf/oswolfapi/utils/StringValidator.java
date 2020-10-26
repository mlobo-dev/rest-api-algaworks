package com.wolf.oswolfapi.utils;

import static org.springframework.util.StringUtils.isEmpty;

public class StringValidator {

    public static boolean isNullOrEmpty(String s){
        return s==null || isEmpty(s);
    }
}
