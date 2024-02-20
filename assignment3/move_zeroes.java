class move_zeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
		int cnt = 0;
		for(int k = 0;k<nums.length;k++) {
			if(nums[k]!=0) {
				nums[index] = nums[k];
				index++;
				cnt++;
			}
			else {
				continue;
			}
		}
		
		for(int j = cnt;j<nums.length;j++) {
			nums[j] = 0;
		}
		
		for(int ele:nums) {
			System.out.print(ele+" ");
		}
    }
}
