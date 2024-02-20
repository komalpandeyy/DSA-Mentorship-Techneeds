import java.util.* ;
import java.io.*; 

public class largest_element {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = arr[0];
        for(int ele:arr){
            if(max<ele){
                max = ele;
            }
        }
        return max;

    }
}
