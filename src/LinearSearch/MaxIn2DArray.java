package LinearSearch;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        MaxIn2DArray a=new MaxIn2DArray();
        int[][] nums={
                {34,23,54,7},
                {43,56,22,56}
        };
        System.out.println("Maximum number: "+a.linearSearch(nums));
    }

    int linearSearch(int[][] nums){
        int max=nums[0][0];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if( max < nums[i][j]){
                    max=nums[i][j];
                }
            }
        }
        return max;
    }
}
