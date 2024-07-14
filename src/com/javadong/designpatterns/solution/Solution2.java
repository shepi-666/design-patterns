package com.javadong.designpatterns.solution;

import java.util.*;

/**
 * @author DongShaowei
 * @description
 * @date 2022/9/3 20:20
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            ArrayList<Integer> factors = new ArrayList<>();
            for (int j = 2; j < nums[i]; j++) {
                if ( nums[i] % j == 0) {
                    factors.add(j);
                    int m = nums[i] / j;
                    if (m != i) {
                        factors.add(m);
                    }
                }
            }
            Collections.sort(factors);
            for (Integer x : factors) {
                if (x * x > nums[i]) {
                    System.out.println(x);
                }
            }
        }

    }
}
