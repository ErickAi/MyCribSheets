package com.er;

import java.util.HashSet;
import java.util.Set;

public class Souts {
    private static Set<Long> set = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(3 | 1);
        System.out.println(3&1);
        System.out.println(-2>>1);
        System.out.println(1<<3);
        System.out.println("TryMe".getClass());
        //int i = 4000000000;
        long l = 4000000000L;
        float f = 4000000000F;
        //BigInteger b = 4000000000;
        //BigDecimal d = new BigDecimal(4000000000);
        System.out.println("" + l +" "+ f);

    }
}
