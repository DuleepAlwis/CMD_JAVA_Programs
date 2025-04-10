import java.util.*;

public class LinkedinProbs{

	public static void main(String [] args){
		
		longestString();
		
	}
	
	public static void longestString(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence :");
		String sentence = sc.nextLine();
		int length = Integer.MIN_VALUE;
		String maxWord = "";
		String [] words = sentence.split(" ");
		
		for(String str:words){
			
			if(str.length()>length){
				length = str.length();
				maxWord = str;
			}
		}
		
		System.out.printf("\nLongest string in the sentence is %s and length is %d\n",maxWord,length); 
		
	}
}
