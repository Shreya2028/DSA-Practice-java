package LinearSearch;

public class EvenDigits {

    //1--> count the number of digit
    //2-->count divide by 2 comes 0 then it is even otherwise odd

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("Even Number of digits: "+findNumWithEvenDigit(nums));
    }

    static int findNumWithEvenDigit(int[] nums){
        int count=0;
        for(int num:nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int digits=digits(num);
        return digits%2==0;
    }


    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
