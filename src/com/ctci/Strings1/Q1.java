package com.ctci.Strings1;

import java.util.*;

public class Q1 {


    // 1. you can do this multiple way, one by sorting o(nlogn) and then iterate over
    // to see are there any characters that are adjacent and space - o(k) where k is less than n in average case and k = n in worst case
    // 2. create a hashMap and iterate to create char Frequency, if we ever encounter hashmap.get(key) != null,
    // then char already exists and we can return true - o (n) and space - o(n)
    public boolean isUnique(String s) {
        HashMap<Character, Integer> charFrequency = new HashMap<Character, Integer>();

        s = s.toLowerCase();

        for (int i =0; i < s.length(); i++) {
            if (charFrequency.get(s.charAt(i)) == null) { // char does not exist
                charFrequency.put(s.charAt(i), 1);
            } else {
                return false;
            }
        }
        return true;
    }
    
    public boolean isUniqueInPlace(String s) {

        if (s.length() > 128) {
            return false;
        }
        boolean[] charArray = new boolean[128]; // ascii table has only 128 character and boolean is by default a false

        for (int i =0; i < s.length(); i++) {
            int index = s.charAt(i);
            if (charArray[index]) { // if charArray has true i.e already character was found
                return false;
            } else {
                charArray[index] = true;
            }
        }
        return true;
    }
}
