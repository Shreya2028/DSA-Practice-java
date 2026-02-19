package LinearSearch;

public class LinearSearchString {

    public static void main(String[] args) {
        LinearSearchString a=new LinearSearchString();
        String name="Shreya";
        char target='r';
        System.out.println(a.linearSearch(name,target));
    }

    // return the index if item found otherwise
    // if item not   found return -1
    int linearSearch(String name,char target){
        for(int i=0;i<name.length();i++){
            if(target == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
