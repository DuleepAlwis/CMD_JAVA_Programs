import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Tutorial5{

	
	
	public static void main(String [] args){
		createArray();
	}
	
	private static void createArray(){
		
		Random random = new Random();
		
		Integer [] arr = new Integer[10];
		
		for(int i=0;i<10;i++){
			arr[i] = random.nextInt(1,10);

		}
		
		int target = random.nextInt(1,10);
		getTheTarget(arr,target);
		getTheLargestSumSubArray(arr);
	}
	
	private static void getTheTarget(Integer [] arr,int target){
	
		List li = Arrays.asList(arr);
		System.out.println(li);

		boolean found = false;
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]+arr[j]==target){
				
					System.out.printf("Target %d is achieved with %d+%d \n",target,arr[i],arr[j]);
					found = true;
				}
			}
		}
		
		if(!found){
			System.out.printf("%d target not found \n",target);
		}
		
	}
	
	private static void getTheLargestSumSubArray(Integer [] arr){
	
		int maxSum = 0;
		int sum = 0;
		int st = 0;
		int end = 0;

		for(int i=2;i<arr.length;i++){
			int s = 0;
			int e = 0;
			for(s=0;s<arr.length-i;s++){
				for(int j=s;j<(s+i);j++){
				
					if(j<arr.length){
						sum = sum+arr[j];
						e = j;
					}

				}
				if(sum>maxSum){
					maxSum = sum;
					st = s;
					end = e;
				}
				sum=0;
			}
			
			
		}
		
		System.out.printf("Largeset Sum is %d\n",maxSum);
		for(int i=st;i<end;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	
}

enum COLORS{
	
	RED(0,"RED"),WHITE(1,"WHITE"),BLUE(2,"BLUE");
	
	private int index;
	private String lbl;
	
	public COLORS(int index,String lbl){
		this.index = index;
		this.lbl = lbl;
	}
}
