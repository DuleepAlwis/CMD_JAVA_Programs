import java.util.Scanner;

public class Tutorial4{
	
	public static void main(String [] args){
		
		getTheMinimumOccurences();
	}
	
	public static void getTheMinimumOccurences(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values :");
		String [] input = sc.nextLine().split(" ");
		String minWord = "";
		int count = 0;
		int minCount = 99;
		
		for(int i=0;i<input.length;i++){
			count = 0;
			for(int j=0;j<input.length;j++){
				if(input[i].equals(input[j])){
					count++;
				}
			}
			
			if(count<minCount){
				minCount = count;
				minWord = input[i];
			}
		}
		
		System.out.printf("Minimum occurred item is %s occurred times is %s\n",minWord,minCount); 
	}
}
