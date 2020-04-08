package com.ms.common.utils;

public class OSUtils {


    public static boolean ok(String os) {

        if ("android".equals(os)) {
            return true;
        }
        if ("ios".equals(os)) {
            return true;
        }
        if ("osx".equals(os)) {
            return true;
        }
        if ("windows".equals(os)) {
            return true;
        }

        if ("ubuntu".equals(os)) {
            return true;
        }

        if ("centos".equals(os)) {
            return true;
        }
        return false;
    }


}
