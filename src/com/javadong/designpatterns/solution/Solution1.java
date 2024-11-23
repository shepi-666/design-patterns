package com.javadong.designpatterns.solution;


import java.util.Scanner;

/**
 * @author DongShaowei
 * @description
 * @date 2022/9/3 19:51
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 第一行
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int[] stuffs = new int[n];
        int index = 0;
        // 第二行
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                stuffs[index++] = s.charAt(i) - '0';
            }
        }



        if (stuffs.length <= 1) {  }
        int trueStuff = 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (stuffs[i] == stuffs[j]) {
                trueStuff = stuffs[i];
                break;
            } else {
                j++;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (stuffs[i] != trueStuff) {
                count ++;
            }
        }
        System.out.println(count);
    }

}
