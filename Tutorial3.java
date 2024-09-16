import java.util.*;

public class Tutorial3{
	
	public static void main(String [] args){
			
		/*countDigits();
		countNumVowels();
		anagramChecker();*/
		minimumOccurrence();
	}
	
	public static void countDigits(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = Integer.parseInt(sc.nextLine());
		Map<Integer,Integer> numberDigits = new HashMap<Integer,Integer>();
		
		int n = 0;
		int count = 0;
		while(num>0){
			count = 0;
			n = num%10;
			count++;
			num = num/10;
			if(numberDigits.get(n)!=null){
				count = count+numberDigits.get(n);
				numberDigits.put(n,count);
			}else{
				numberDigits.put(n,count);
			}
		}
		System.out.println("Number of occurences "+numberDigits);
	}
	
	public static void countNumVowels(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word : ");
		String word = sc.nextLine();
		word = word.toLowerCase();
		String vowels = "aeiou";
		Map<Character,Integer> vowelsOccur = new HashMap<Character,Integer>();
		int count = 0;
		
		for(int i=0;i<vowels.length();i++){
			vowelsOccur.put(vowels.charAt(i),count);
		}
		
		for(int i=0;i<word.length();i++){
			count = 0;
			if(vowels.contains(word.charAt(i)+"")){
				count++;
				count = count + vowelsOccur.get(word.charAt(i));
				vowelsOccur.put(word.charAt(i),count);
			}
			
		}
		
		System.out.println("Vowels count in the word "+vowelsOccur);
		
		
	}
	
	public static void anagramChecker(){
		
		System.out.print("Enter word 1 :");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		System.out.print("\n Enter word 2:");
		String word2 = sc.nextLine();
		
		char [] arr1 = word1.toCharArray();
		char [] arr2 = word2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1,arr2)){
			System.out.printf("%s and %s are anagrams \n",word1,word2);
		}else{
			System.out.printf("%s and %s are not anagrams \n",word1,word2);
		}
	}
	
	public static void minimumOccurrence(){
	
		System.out.print("Enter numbers :");
		Scanner sc = new Scanner(System.in);
		String [] nums = sc.nextLine().split(" ");
		int [] arr = new int[nums.length];
		
		for(int i=0;i<nums.length;i++){
			arr[i] = Integer.parseInt(nums[i]);
		}
		
		int minNum = arr[0];
		int minOccur = 99;
		int count = 0;
		
		for(int i=0;i<arr.length;i++){
			count = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count<minOccur || count==minOccur){
				minOccur = count;
				minNum = arr[i];
			}

		}
		System.out.printf("Minimum occurred number is %s and number of occurences is %s \n",minNum,minOccur);
	}
}
