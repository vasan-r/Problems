package algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int s = low;
        int l = high;
        int m = low+(high-low)/2;
        int pivot = arr[m];

        while (s<=l){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[l]>pivot){
                l--;
            }
            if(s<=l){
                int t = arr[s];
                arr[s++] = arr[l];
                arr[l--] = t;
            }
        }
        sort(arr,low,l);
        sort(arr,s,high);
    }
}
