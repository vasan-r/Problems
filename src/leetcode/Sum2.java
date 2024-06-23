package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Sum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] a = twoSum2(arr,9);
        System.out.println(Arrays.toString(a));
    }
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = target-numbers[i];
            if(map.containsKey(num)){
                return new int[] {map.get(num)+1,i+1};
            }else {
                map.put(numbers[i],i);
            }
        }return new int[] {-1,-1};
    }
    public static int[] twoSum2(int[] numbers, int target) {
        Arrays.sort(numbers);
        int f = 0;
        int l = numbers.length-1;
        while (f<l){
            int num = numbers[f] + numbers[l];
            if(num==target){
                return new int[] {f+1,l+1};
            } else if (num<target) {
                f++;
            } else if (num>target) {
                l--;
            }
        }return new int[] {-1,-1};
    }
}
