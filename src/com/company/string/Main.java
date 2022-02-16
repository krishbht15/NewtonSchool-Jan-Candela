package com.company.string;

public class Main {

    public static void main(String[] args) {
//        System.out.println(maxPower("abcddddeeeeeab"));
        System.out.println(toggleCase("aBcDeF"));
    }

//    https://leetcode.com/problems/consecutive-characters/

    public static int maxPower(String s) {
        int ans = 0;
        int count = 1;
        char last = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (last == curr) {
                count++;
            } else {
                last = curr;
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static String toggleCase(String s) {
        String ans = "";
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr >= 'a' && curr <= 'z') {
                char newChar = (char) (curr + 'A' - 'a');
                ans = ans + newChar;
                answer.append(newChar);
            } else {
                char newChar = (char) (curr + 'a' - 'A');
                ans = ans + newChar;
                answer.append(newChar);
            }
        }
        return answer.toString();
    }
}
