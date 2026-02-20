package BinarySearch;

public class OrderAgnosticBs {
    public static void main(String[] args) {
       // int[] arr={-18,-12,-6,0,4,10,24,38,45,67,89};
        int[] arr={99,80,75,22,11,10,5,2,-3};
        int target=22;
        System.out.println("Index of a target element: "+basicBs(arr,target));
    }

    //return the index
    //return -1 if it does not exist
    static int basicBs(int[] nums,int target){
        int start=0;
        int end=nums.length-1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc=nums[start]<nums[end];

        while(start<=end){
            // find the middle element
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }

            if(isAsc){
                if(target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else {
                if(target>nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
