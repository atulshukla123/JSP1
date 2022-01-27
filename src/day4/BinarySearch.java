package day4;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 9, 10, 12, };
        int item = 19;
        int l = 0;
        int r = arr.length-1;
        boolean flag = false;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == item){
                flag = true;
                System.out.print("Found" );
                return;
            }else if(item>arr[mid]){
                l = mid+1;
            }else {
                r = mid-1;
            }
        }
        System.out.print(" Not Found" );
    }
}
