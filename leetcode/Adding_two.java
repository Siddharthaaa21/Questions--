class Adding_two {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j =i;j<i+1;j++){
                if(target==(nums[i]+nums[j]))
                    a[0]=i;
                a[1]=j;
     }
        }return a;
    }}
