package BinarySearch;

public class BasicBs {
    public static void main(String[] args) {
        int[] arr={-18,-12,-6,0,4,10,24,38,45,67,89};
        int target=67;
        System.out.println("Index of a target element: "+basicBs(arr,target));
    }

    //return the index
    //return -1 if it does not exist
    static int basicBs(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            // find the middle element
            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }else if(target > nums[mid]) {
                start=mid+1;
            }else{
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
