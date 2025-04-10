package InterviewPrep;

import java.util.Scanner;

public class InterviewPrepTwo{

	public static void main(String [] args){
			System.out.println("Enter numbers:");
			Scanner sc = new Scanner(System.in);
			String [] numbers = sc.nextLine().split(" ");
			int [] arr = new int[numbers.length];
			int i=0;
			for(String str:numbers){
				arr[i++] = Integer.parseInt(str);
			}
			getTheMaxOccurence(arr);
	}
	
	public static void getTheMaxOccurence(int [] arr){
	
		int max = 0;
		int maxOccurence = 0;
		int count = 0;
		
		for(int i=0;i<arr.length;i++){
			count = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			
			if(count>maxOccurence){
				maxOccurence = count;
				max = arr[i];
			}
		}
		
		System.out.printf("Maximum occuring number is %d occurred at %d of times\n",max,maxOccurence);
	}
}
