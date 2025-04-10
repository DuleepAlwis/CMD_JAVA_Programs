public class ArrayDiagonalSum{
	
	public static void main(String [] args){
		
		getDiagonalSum();
	
	}
	
	private static void getDiagonalSum(){
	
		int [][] arr = {{1,2,3},{1,2},{1,2,3,4,5}};
		
		int ml = 0;
		
		for(int i=0;i<arr.length;i++){
			if(ml<arr[i].length){
				ml = arr[i].length;
			}
		}
		
		int [][] arrNew = new int[ml][ml];
		
		for(int k=0;k<arr.length;k++){
			int j =0;
			
			for(j=0;j<arr[k].length;j++){

					arrNew[k][j] = arr[k][j];

			}
			
			

		}
		
		int sum = 0;
		
		for(int z=0;z<ml;z++){
			sum = sum + arrNew[z][z];
		}
		
		System.out.printf("Sum of the 1st diagonal is %d \n",sum);
		
		int sum2 = 0;
		int inc = 0;
		for(int z=ml-1;z>=0;z--){
			//System.out.println(arrNew[z][z]);
			sum2 = sum2 + arrNew[inc++][z];
		}
		
		System.out.printf("Sum of the 2nd diagonal is %d \n",sum2);
		
		System.out.printf("Sum of the total diagonal is %d \n",(sum+sum2));
	}

}
