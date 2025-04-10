package abc;

import java.util.Scanner;
public class Tutorial2{
	
	public static void main(String [] args){
		System.out.print("Enter values : ");
		Scanner sc = new Scanner(System.in);
		String [] arr = sc.nextLine().split(" ");
		getTheMaximum(arr);
	}
	
	public static void getTheMaximum(String [] values){
		
		int [] arr = new int[values.length];
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(values[i]);
		}
		
		int max = 0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		
		System.out.printf("**********************\nMaximum value is=%d\n",max);
	}
}
