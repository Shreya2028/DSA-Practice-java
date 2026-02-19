package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        SearchIn2DArray a=new SearchIn2DArray();
        int[][] nums={
                {34,23,54,7},
                {43,56,22,56}
                };
        int target=43;
        int[] arr=a.linearSearch(nums,target);//format of return value(row,col)
        System.out.println(Arrays.toString(arr));
    }

    int[] linearSearch(int[][] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(target == nums[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
