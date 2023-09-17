import java.util.Scanner;
import java.io.*;
import java.util.*;

public class InterviewPrepOne{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String word = sc.nextLine();
		reverseString(word);
		swapNumbers(1,2);
		swapStrings("ala","lkj");
		sortBirthdays();
	}
	
	public static void reverseString(String word){
		
		word = word.concat("-");
		
		int j = word.length()-1;
		
		while(j>0){
			word = word.concat(word.charAt(j-1)+"");
			j--;
		}
		
		System.out.println("Reverse of the word : "+word+" "+word.split("-")[1]);
	}
	
	public static void swapNumbers(int x,int y){
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Numbers swapped are : "+x+" "+y);
	}
	
	public static void swapStrings(String word1,String word2){
		
		word1 = word1.concat("-");
		word1 = word1.concat(word2);
		word2 = word1.split("-")[0];
		word1 = word1.split("-")[1];
		System.out.println("Swapped strings are "+word1+" "+word2);
	}
	
	public static void sortBirthdays(){
		
		File file = new File("birthdays.txt");
		try{
		
		
			BufferedReader br = new BufferedReader(new FileReader(file));
			ArrayList<String> birthdays = new ArrayList<String>();
			String line = "";
			while((line=br.readLine())!=null){
				birthdays.add(line.trim());
			}
			
			Collections.sort(birthdays);
			
			for(String str:birthdays){
				System.out.println(str);
			}
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
	}
}
