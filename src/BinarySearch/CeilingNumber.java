package BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr={2,6,10,13,19,24,35,43,55,67,89};
      //  int[] arr={87,56,43,40,39,38,27,25,17,11,9,2,0,-5};
        int target=42;
        int ans=ceilingNum(arr,target);
        System.out.println(ans);
    }

    //Smallest Element in Array greater or equal to target.
    static int ceilingNum(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        boolean isAsc=nums[start]<nums[end];
        while (start<=end){
            int mid=start +(end -start)/10;

            if(target == nums[mid]){
                return nums[mid];
            }
            if(isAsc){
                if(target>nums[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if(target>nums[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }

        }


        return isAsc ? nums[start] : nums[end];
    }
}
