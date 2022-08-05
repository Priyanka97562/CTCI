package com.ctci.Strings1;

public class Q9 {

    // 1.9 - check is s2 is rotated s1 string
    public boolean isStringRotated(String s1, String s2) {

        if (s1.length() == s2.length() && s1.length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(s1).append(s1);

            return sb.toString().contains(s2); // .contains is similar to isSubstring
        }

        return false;
    }
}
