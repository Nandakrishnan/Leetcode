public class MaxConsecutiveOnes {
    public static void findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
        	count++;
        	result = Math.max(count, result);
            }
            else count = 0;
        }
        
        System.out.println(result);
    }
    
    public static void main(String[] args){
    	int [] arr=new int[5];
    	arr[0]=0;
    	arr[1]=1;
    	arr[2]=1;
    	arr[3]=1;
    	arr[4]=0;
    	findMaxConsecutiveOnes(arr);
    }
}
