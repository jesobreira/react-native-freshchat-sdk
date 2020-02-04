package com.freshchat.consumer.sdk.react;

public class StringUtils {

    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0 || str.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
