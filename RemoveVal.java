import java.util.ArrayList;

public class RemoveVal {
    
    public static void main(String [] args){
    	int [] arr1 = {3,2,2,3};
    	removeElement(arr1,3);

    	for(int i=0;i<arr1.length;i++){
    		System.out.print(arr1[i]+" ");
    	}
    	    		System.out.println();
    	int [] arr2 = {0,1,2,2,3,0,4,2};
    	    	removeElement(arr2,2);
    	    	for(int i=0;i<arr2.length;i++){
    		System.out.print(arr2[i]+" ");
    	}
    	    		System.out.println();
    }

    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ans.add(nums[i]);
            }
        }
         int j = 0;
        int [] ansNum = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i<ans.size()){
                ansNum[i] = ans.get(i);
            }
        }
        nums = ansNum;

        System.out.println(ans);
        return ans.size();
    }
}
