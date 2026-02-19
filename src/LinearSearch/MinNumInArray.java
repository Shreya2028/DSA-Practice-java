package LinearSearch;

public class MinNumInArray {

    public static void main(String[] args) {
       MinNumInArray a=new MinNumInArray();
        int[] nums={34,23,54,7,43,9,45,90};

        System.out.println("Minimum number is: "+a.linearSearch(nums));
    }

    int linearSearch(int[] nums){
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
}
