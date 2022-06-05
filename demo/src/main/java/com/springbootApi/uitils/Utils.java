package com.springbootApi.uitils;


import java.util.Collection;

public class Utils {

    private Utils() {

    }

    /**
     * check str is not null & empty
     *
     * @param str input string
     * @return true if not null & empty
     */
    public static boolean notNullAndEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }

    /**
     * @param objects
     * @return
     */
    public static boolean notNullAndEmpty(Object[] objects) {
        return objects != null && objects.length > 0;
    }


    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isNullOrEmpty(Object[] objects) {
        return objects == null || objects.length == 0;
    }

    public static <O> boolean isNullOrEmpty(Collection<O> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * @param collection
     * @return
     */
    public static <O> boolean notNullAndEmpty(Collection<O> collection) {
        return collection != null && !collection.isEmpty();
    }

    public static boolean compareEnum(Object... o) {

        for (int i = 0; i < o.length - 1; i ++)
            if (!o[i].toString().equals(o[i + 1].toString())) return false;

        return true;
    }

}
