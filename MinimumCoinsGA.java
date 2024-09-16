import java.util.*;

public class MinimumCoinsGA{

	public static void main(String [] args){
		
		System.out.println("Enter number of coins ");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		int [] coins = new int[num];
		int i=0;
		while(num>0){
			
			System.out.println("Enter coin value : ");
			coins[i++] = Integer.parseInt(sc.nextLine());
			num--;
		}
		
		System.out.println("Enter target : ");
		int target = Integer.parseInt(sc.nextLine());
		minimumCount(target,coins);
	
	}
	
	public static void minimumCount(int target,int [] coins){
		
		coins = sortDescCoins(coins);
		List<Integer> result = new ArrayList<Integer>();
		int tmp = 0;
		
		for(int i=0;i<coins.length;i++){
			int c = coins[i];
			tmp = tmp+c;
			if(i==target){
				System.out.printf("%d can be exchanged with %d",target,c);
			}else if(tmp<target){

				result.add(c);
				coins[i] = 0;
			}else if(tmp==target){
				result.add(c);
				System.out.println(target+" can achieved with ="+result);
				return;
			}else if(tmp>target){
				int r = findMatcher(coins,(target-(tmp-coins[i])));
				if(r>-1){
					result.add(coins[r]);
					System.out.println(target+" can achieved with ==>"+result);
					return;
				}else{
					result.add(c);
					System.out.println(target+" can achieved with ===>"+result);
					return;
				}
			}
		}
		
	}
	
	private static int [] sortDescCoins(int [] coins){
		
		for(int i=0;i<coins.length;i++){
			
			for(int j=i+1;j<coins.length;j++){
				if(coins[i]<coins[j]){
					int tmp = coins[i];
					coins[i] = coins[j];
					coins[j] = tmp;
				}
			}
		}
		return coins;
		
	}
	
	private static int findMatcher(int [] coins,int target){
		
		for(int i=0;i<coins.length;i++){
			if(coins[i]==target){
				return i;
			}
		}
		return -1;
	}
	
}
