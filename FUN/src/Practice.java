
public class Practice 
{
	public static int[] twoSum(int[] nums, int target) 
    {
        int[] ans = new int[2];
        
        for(int ii = 0; ii< nums.length-1; ii++)
        {
            for(int jj = ii+1; jj < nums.length; jj++)
            {
                int test = nums[ii] + nums[jj];
                if(test == target)
                {
                    ans[0] = ii;
                    ans[1] = jj;
                    return ans;
                }
            }
        }
        return ans;
    }
	
	public static void main(String[] args) 
	{
		int[] arr = new int[3];
			arr[0] = 3;
				arr[1] = 2;
					arr[2] = 4;
		int[] ans = twoSum(arr,6);
		System.out.println(ans[0] + " " + ans[1]);
	}

}
