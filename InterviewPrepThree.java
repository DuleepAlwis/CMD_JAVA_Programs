package birthdaysort;

import java.util.*;
import java.io.*;

public class InterviewPrepThree{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name : ");
		String fileName = sc.nextLine();
		sortBirthdays(fileName);
	}
	
	public static void sortBirthdays(String fileName){
		
		try{
		
		
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = "";
		ArrayList<String> birthdays = new ArrayList<String>();
		System.out.println("Before sorting=====>");
		while((line=br.readLine())!=null){
			System.out.println(line);
			birthdays.add(line.trim());
		}
		
		Collections.sort(birthdays);
		System.out.println("After sorting=====>");
		for(String str:birthdays){
			System.out.println(str);
		}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	
}
