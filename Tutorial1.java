import java.util.HashMap;



public class Tutorial1{

	public static void main(String [] args){
		
		printPrimeNumbers(Integer.parseInt(args[0]));
		printTheOccurence(new int[]{1,1,2,2,3,55,55,6,7,7,7});
	}
	
	public static void printPrimeNumbers(int upto){
		
		int count = 0;
		
		for(int i=1;i<upto;i++){
			count = 0;
			for(int j=1;j<i+1;j++){
				if(i%j==0){
					count++;
				}
			}
			
			if(count==2){
				System.out.println(i);
			}
		}
	}
	
	public static void printTheOccurence(int [] arr){
	
		HashMap<Integer,Integer> occurences = new HashMap<Integer,Integer>();
		int count = 0;
		for(int i=0;i<arr.length;i++){
			count = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			
			occurences.put(arr[i],count);
		}
		System.out.println("Occurences : "+occurences);
		
	}
}
