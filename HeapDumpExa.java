import java.util.ArrayList;
import java.util.List;

public class HeapDumpExa{


	public static void main(String [] args){
		
		        List<int[]> memoryConsumer = new ArrayList<>();
		while(true){
		
			memoryConsumer.add(new int[1_000_000]);
                	System.out.println("Allocated more memory...");
		}
	}
}
