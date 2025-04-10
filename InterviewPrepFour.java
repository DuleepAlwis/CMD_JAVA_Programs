package IPF;

import java.util.Scanner;
import java.util.HashMap;

public class InterviewPrepFour{

	public static void main(String [] args){
		//countDigits();
		//numberOfOccurenceInNumber();
		getThePower();
	}
	
	public static void countDigits(){
		
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		while(num>0){
			count++;
			num = num/10;
		}
		
		System.out.println("Number of digits is "+count);
	}
	
	public static void numberOfOccurenceInNumber(){
		
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("\nEnter the target digit :");
		int target = Integer.parseInt(sc.nextLine());
		
		int digit = 0;
		HashMap<Integer,Integer> counts = new HashMap<Integer,Integer>();
		while(num>0){
			digit = num%10;
			if(counts.get(digit)!=null){
				counts.put(digit,counts.get(digit)+1);
			}else{
				counts.put(digit,1);
			}
			num = num/10;
		}
		System.out.println(counts);
		System.out.println("Number of occurences of "+target+" is :"+counts.get(target));
	}
	
	public static int powerofN(int i,int power,int total){
		if(power==0){
			return total;
		}else{
			total = total*i;
			return powerofN(i,--power,total);
		}
	}
	
	public static void getThePower(){
		
		System.out.println("Enter the base number :");
		Scanner sc = new Scanner(System.in);
		int baseNum = Integer.parseInt(sc.nextLine());
		System.out.println("\nEnter the power :");
		int power = Integer.parseInt(sc.nextLine());
		System.out.println(powerofN(baseNum,power,1));
	}
}
