class sorted_rotated {
    public boolean check(int[] nums) {
       
       int min_idx = 0;
      for(int i = nums.length-1;i>0;i--){
          if(nums[i]<nums[i-1]){
              min_idx = i;
          }
      }

       rotate(min_idx,nums);
       
       for(int i = 0;i<nums.length-1;i++){
           if(nums[i]<=nums[i+1]){
               continue;

           }
           else{
               return false;
           }
       }

       return true;


    }

    public static void rotate(int r,int[] arr){
        r = arr.length-r;
        for(int j = 0;j<r;j++){
        int key = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = key;
        }

        



    }
}
