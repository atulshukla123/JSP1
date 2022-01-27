package leetcode;


class FirstLastPosition34 {

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;

        int t[]= searchRange(nums, target);

        for (int i = 0; i <t.length ; i++) {
            System.out.println(t[i]);
        }

    }


    public static int[] searchRange(int[] nums, int target) {
        int fs = binarySearchFS(nums, target);
        int ls = binarySearchLS(nums, target);

        return new int[]{ls, fs};
    }

    static int binarySearchFS(int[] nums, int target){

        int l = 0;
        int r= nums.length-1;
        int fs = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]== target){
                fs = mid;
                l = mid+1;
            }else if(target > nums[mid]){
                l = mid+1;
            }else{
                r = mid-1;
            }

        }
        return fs;
    }


    static int binarySearchLS(int[] nums, int target){

        int l = 0;
        int r= nums.length-1;
        int ls = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]== target){
                ls = mid;
                r = mid-1;
            }else if(target > nums[mid]){
                l = mid+1;
            }else{
                r = mid-1;
            }

        }
        return ls;
    }

}