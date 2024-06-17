package algorithms.searching;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(find(arr,11));
    }

    private static int find(int[] arr, int t) {
        int first=0;
        int last = arr.length-1;


        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]>t){
                first = mid+1;
            }else if(arr[mid]<t){
                last = mid-1;
            }else if(arr[mid]==t){
                return mid;
            }
        }return -1;
    }
}
