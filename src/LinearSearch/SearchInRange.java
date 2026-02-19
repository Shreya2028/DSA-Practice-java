package LinearSearch;

public class SearchInRange {

    public static void main(String[] args) {
        SearchInRange a=new SearchInRange();
        int[] nums={34,23,54,7,43,9,2,45,90};
        int target=43;
        System.out.println("Index Position is: "+a.linearSearch(nums,target,2,6));
    }

    // return the index if item found otherwise
    // if item not   found return -1
    int linearSearch(int[] nums,int target,int Start,int end){
        if(nums == null){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
