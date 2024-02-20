class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
         long min = a[0];
         long max = a[0];
         for(long ele:a){
             if(min>ele){
                 min = ele;
             }
             if(max<ele){
                 max = ele;
             }
         }
          return new Pair(min,max);
    }
   
}

