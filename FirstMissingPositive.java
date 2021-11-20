public class FirstMissingPositive {

    public static void main(String[] args) {
        
        int[] arr = {12, 6, 4, 2, 1, -6, 0};
        System.out.println(find(arr));
    }
    
    public static int find(int[] nums){
        
        if(nums == null || nums.length == 0) return 1;
        int n = nums.length;
        boolean containsOne = false;
        
        //STEP 1: Make all elements we don't care equals to '1'
        //elements we don't care about (Zeros, negative integer and elements greater than 'n')
        for(int i = 0; i < n; i++){
        
            if(nums[i] == 1) containsOne = true; //if we have '1' in an array
            else if(nums[i] <= 0 || nums[i] > n){ //if we don't have and that element is '0', '-', or > n
                nums[i] = 1; //then set it to '1'
            }
        }
        
        if(containsOne == false) return 1; //if we don't have '1', return '1' since it is the smallest '+' integer
        
        //STEP 2: Flip the sign of the positive elements in the array
        for(int i = 0; i < n; i++){
        
            int index = Math.abs(nums[i]) - 1; //since we are 0-based in indexes, we substract 1
            
            if(nums[index] > 0) nums[index] = -1 * nums[index];
        }
        
        //STEP 3: Get the index of the first POSITIVE element in an array and add it with 1, then return it to the caller
        for(int  i = 0; i < n; i++){
            
            if(nums[i] > 0) return i + 1;
        }
        
        //if we make it here, this means that the first missing positive is OUT OF BOUNDS
        //ex.: [3, 1, 2] >> missing = 4
        //then, we'll just return the length of the array + 1: [3, 1, 2] >> n = 3, missing = 3 + 1 = 4
        return n + 1;
        
    
    }
    
}
