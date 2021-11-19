/*

It is basically a traditional way of adding numbers, we will start to the least significant digit
or right most digit, add the value, if we have a 'carry', add this carry to the next digit (digit on it's left part).

Here, we need to add one to the array and return the output of it.

Example:

input: [9, 9, 9] = 999
999 + 1 = 1000
output: [1, 0, 0, 0]

input: [4, 2, 9]
429 + 1 = 430
output: [4, 3, 0]

*/


import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        
        int[] myNum = {4,1,9};
        System.out.println(Arrays.toString(plusOne(myNum)));
    }

    private static int[] plusOne(int[] myNum) {
        
        //loop through an array starting from the rightmost index
        for(int i = myNum.length - 1; i >= 0; i--){
        
            //check if it less than 9 so we can add '1' and return the array to the caller
            if(myNum[i] < 9){
                myNum[i] = myNum[i] + 1;
                return myNum;
            }
            
            //if we able to execute it, this means we have '9' as value so make it '0'...
            //...and continue the loop until we encounter value that is less than '9'...
            //...or if we able to break out of this for loop and proceed to the next statement...
            myNum[i] = 0;
        }
        
        //...this means that our values consists of all '9s', then we will create new array...
        //...because we need to expand the size of it
        int[] newNum = new int[myNum.length + 1];
        
        //set the value of index zero to '1', it is like (ex: 9 + 1 = 10, where index 0 = 1 & index 1 = 0...)
        newNum[0] = 1;
        
        //newNum[1 to newNum.length - 1] is already set to '0' as default
        //so we don't need to set the other indexes to '0' since it is '0; by default
        
        return newNum;
        
    }
    
}
