
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       
       if(arr.length==1){
           return 0;
       }
       for(int i = 0;i<arr.length;i++){
           if(i==0&&arr[0]>=arr[1]){
               return 0;
           }
           else if(i==n-1&&arr[n-1]>=arr[n-2]){
               return n-1;
           }
           else if((i!=0&&arr[i]>=arr[i-1])&&(i!=n-1&&arr[i]>=arr[i+1]))
           {
           return i;
           }
       }
       
       return -1;
    }
}
