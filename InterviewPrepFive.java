import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class InterviewPrepFive{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to reverse : ");
		int num = Integer.parseInt(sc.nextLine());
		reverseNumber(num);
		
		System.out.print("Enter the sentence : ");
		String sen = sc.nextLine();
		searchDuplicatesInSentence(sen);
		
		System.out.print("Enter the number count : ");
		int c = Integer.parseInt(sc.nextLine());
		int [] arr = new int[c];
		System.out.println("\n Enter the numbers : ");
		for(int i=0;i<c;i++){
			int n = Integer.parseInt(sc.nextLine());
			arr[i] = n;
		}
		
		getSumOfIntArray(arr);
	}
	
	public static void reverseNumber(int num){
	
		int tmp = num;
		int power = 0;
		int len = (-1);
		int newValue = 0;
		
		while(tmp>0){
			len++;
			tmp = tmp/10;
		}
		
		tmp = num;
		while(tmp>0){
			newValue = newValue + (int)((tmp%10)*Math.pow(10,len));
			len--;
			tmp = tmp/10;
		}
		
		System.out.printf("%d reverse is %d\n",num,newValue);
	}
	
	public static void searchDuplicatesInSentence(String sentence){
		
		sentence = sentence.toLowerCase();
		String [] strArray = sentence.split(" ");
		Map<String,String> foundMap = new HashMap<String,String>();
		
		for(int i=0;i<strArray.length;i++){
			for(int j=i+1;j<strArray.length;j++){
				if(strArray[i].equals(strArray[j]) && foundMap.get(strArray[i])==null){
					foundMap.put(strArray[i],strArray[i]);
					System.out.printf("Duplicate string found %s\n",strArray[i]);
				}
			}
		}
	}
	
	public static void getSumOfIntArray(int [] arr){
		
		int sum = 0;

		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		
		System.out.println("Total count : "+sum);
		sum = 0;
		for(int i=0;i<arr.length;i++){
			int tmp = arr[i];
			if(tmp%2==0){
				sum = sum + tmp;
			}
		}
		
		System.out.println("Total count of even numbers : "+sum);
		
		sum = 0;
		for(int i=0;i<arr.length;i++){
			int tmp = arr[i];
			if(tmp%2!=0){
				sum = sum + tmp;
			}
		}
		
		System.out.println("Total count of odd numbers : "+sum);
		
		
	}

}
