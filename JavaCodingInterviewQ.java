import java.util.*;
import java.util.stream.Collectors;


public class JavaCodingInterviewQ{

	
	public static void main(String [] args){
		
		String word = "Hello World Hello World Cat Cr Cat Cat KLJ JHQ";
		getDuplicateWordsInString(word);
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter amount : ");
		int num = Integer.parseInt(sc.nextLine());
		int [] arr = new int[num];
		
		System.out.println("Enter numbers : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		numberOfOccurrenceSingleLoop(arr);
		maximumOccurrenceSingleLoop(arr);
		fibonachiSeriesLoop(10);
	}
	
	public static void getDuplicateWordsInString(String word){
		
		String [] arr = word.split(" ");
		
		Map<String,Integer> wordCount = Arrays.stream(arr).collect(Collectors.toMap(key->key,key->0,(existing,replacement)->existing));
		
		for(String s:arr){
			wordCount.put(s,wordCount.getOrDefault(s,0)+1);
		}
		
		
		for(Map.Entry<String,Integer> map:wordCount.entrySet()){
			if(map.getValue()>1){
				System.out.println(map.getKey()+" "+map.getValue()+" is duplicated");
			}
		}
		
	}
	
	public static void numberOfOccurrenceSingleLoop(int [] arr){
		
		Map<Integer,Integer> occurrences = new HashMap<Integer,Integer>();
		
		System.out.println("=========Number of Occurrences============");
		
		for(int i:arr){
			occurrences.put(i,occurrences.getOrDefault(i,0)+1);
		}
		
		System.out.println(occurrences);
	}	
	
	public static void maximumOccurrenceSingleLoop(int [] arr){
		
		Map<Integer,Integer> occurrences = new HashMap<>();
		int maxOccurrence = 0;
		int number = 0;
		
		System.out.println("==========Maximum Occurrence=================");
		
		for(int i:arr){
			
			occurrences.put(i,occurrences.getOrDefault(i,0)+1);
			if(occurrences.get(i)>maxOccurrence){
				maxOccurrence = occurrences.get(i);
				number = i;
			}
		}
		
		System.out.println(occurrences);
		
		System.out.printf("Maximum occurrence %d , number is %d \n",maxOccurrence,number);
	}
	
	public static void fibonachiSeriesLoop(int end){
	
		int f = 0;
		int s = 1;
		
		System.out.println(f+s);

		for(int i=2;i<end;i++){
			
			int next = f+s;
			f = s;
			s = next;
			
			System.out.println(next);
		}
	}
}
