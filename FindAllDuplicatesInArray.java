/*

Find the duplicates in array

1 <= array[index] <= n

where n = length of array

Runtime:
Time Complexity = O(n) or linear time
Space Complexity = O(1) or constant space
                 = O(n) if you consider the result (which is a 'duplicates' list) as an extra space

*/


import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

    public static void main(String[] args) {
        
        int[] arr = {4,3,2,1,6,2,3,4};
        
        System.out.println(finder(arr));
    }

    private static List finder(int[] arr) {
        
        List<Integer> duplicates = new ArrayList<>(); //List where you can store the duplicate numbers
        
        //Iterate through an array
        for(int i = 0; i < arr.length; i++){
            
            //at i = 0, val = 4, then x = |4| - 1, then x = 3
            int x = Math.abs(arr[i]) - 1;
            
            //at arr[3] = 2 which is positive, then skip this IF STATEMENT
            if(arr[x] < 0){
                duplicates.add(x + 1);
            }
            
            //flip the sign of the value, then arr[3] = -2
            arr[x] = (arr[x]) * -1;
            
            //it will just continue until we break out of a for loop
        }
        return duplicates;
    }
    
}
