package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int f, int l) {
        if((l-f)==1)
            return;

        int mid = (f+l)/2;

        mergesort(arr,f,mid);
        mergesort(arr,mid,l);

        merge(arr,f,mid,l);
    }

    private static void merge(int[] arr, int f, int mid, int l) {
        int i = f;
        int j = mid;
        int k = 0;
        int[] mix = new int[l-f];

        while (i<mid && j<l){
            if(arr[i]<arr[j]){
                mix[k++] = arr[i++];
            }else {
                mix[k++] = arr[j++];
            }
        }
        while (i<mid){
            mix[k++] = arr[i++];
        }
        while (j<l){
            mix[k++] = arr[j++];
        }
        for (int m = 0; m < mix.length; m++) {
            arr[f+m] = mix[m];
        }
    }
}
