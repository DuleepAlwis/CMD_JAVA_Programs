import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates{
	
	public static void main(String [] args){
		int [] arr1 = {1,1,2};
		removeDuplicates(arr1);
	}


	public static int removeDuplicates(int[] nums) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		/*List<Integer> nums2 = new ArrayList<>(Arrays.stream(nums) 
		                    .boxed()      
		                    .toList());  */
		List<Integer> nums2 = new ArrayList<>();
		for(int z=0;z<nums.length;z++){
		    nums2.add(nums[z]);
		}
		for(int i=0;i<nums.length;i++){
		    int c = 0;
		    int tmp = nums[i];
		    for(int j=0;j<nums.length;j++){
		        if(tmp==nums[j]){
		            c++;
		        }
		    }
		    if(getCount(nums2,tmp)>1){
		        for(int k=0;k<c-1;k++){
		            System.out.println("remove duplicates "+tmp);
		            nums2.remove(Integer.valueOf(tmp));
		        }
		    }
		    
		}
		nums = nums2.stream()
		          .mapToInt(Integer::intValue)
		          .toArray();
		Arrays.stream(nums)
      .boxed().forEach(s->System.out.println(s));   
		return nums.length;
    	}
    	
    	private static int getCount(List<Integer> nums,int tmp){
    		int c = 0;
    		for(int i=0;i<nums.size();i++){
    			
    	

    				if(tmp==nums.get(i)){
    					c++;
    				}
    			
    		}
    		return c;
    	}
}
