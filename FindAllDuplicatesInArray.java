
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

    public static void main(String[] args) {
        
        int[] arr = {4,3,2,1,6,2,3,4};
        
        System.out.println(finder(arr));
    }

    private static List finder(int[] arr) {
        
        List<Integer> duplicates = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            int x = Math.abs(arr[i]) - 1;
            if(arr[x] < 0){
                duplicates.add(x + 1);
            }
            arr[x] = (arr[x]) * -1;
        }
        return duplicates;
    }
    
}
