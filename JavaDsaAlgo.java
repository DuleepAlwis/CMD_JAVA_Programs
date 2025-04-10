import java.util.Arrays;

public class JavaDsaAlgo{

	public static void main(String [] args){
		
		mergeSortedToOne();
		
		
	}
	
	public static void mergeSortedToOne(){
		
		int [] arr1 = {2,3,4,1,2,5,7};
		int [] arr2 = {1,2,4,3,9,7};
		int [] result = new int[arr1.length+arr2.length];
		
		arr1 = bubbleSort(arr1);
		arr2 = bubbleSort(arr2);
		
		int i=0;
		for(i=0;i<arr1.length;i++){
			result[i] = arr1[i];
		}
		for(int j=0;j<arr2.length;j++){
			result[i++] = arr2[j];
		}
		result = bubbleSort(result);
		
		System.out.println("===============================");
		for(int j:arr1){
			System.out.print(j+" ");
		}
		System.out.println("");
		System.out.println("===============================");
		for(int j:arr2){
			System.out.print(j+" ");
		}
		System.out.println("");
		System.out.println("===============================");
		
		Arrays.stream(result).forEach(System.out::println);
	}
	
	public static int[] bubbleSort(int [] arr){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		return arr;
	}
}
