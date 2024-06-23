package leetcode;

import java.util.Arrays;

public class MaxArea {
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TmaxArea(a));
    }
    public static int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                area = Math.max(area,Math.min(height[i],height[j])*(j-i));
            }
        }
        return area;
    }
    public static int EmaxArea(int[] A) {
        int len = A.length;
        int l = 0;
        int r = len -1;
        int area = 0;

        while (l < r)
        {
            // Calculating the max area
            area = Math.max(area,
                    Math.min(A[l], A[r]) * (r - l));

            if (A[l] < A[r])
                l += 1;

            else
                r -= 1;
        }
        return area;
    }
    public static int TmaxArea(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(height[i],max);
            prefix[i] = max;
        }
        max = 0;
        for (int i = n-1; i >= 0; i--) {
            max = Math.max(height[i],max);
            suffix[i] = max;
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.min(prefix[i],suffix[i])-height[i];
        }
        return result;
    }
}
