
class missing_no {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = n*(n+1)/2;
    int sum2 = 0;
    for(int ele:nums){
        sum2+=ele;
    }
    return sum-sum2;

       
      
    }
}
