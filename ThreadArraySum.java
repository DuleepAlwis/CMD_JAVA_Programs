public class ThreadArraySum{

	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6,7};
		ArraySum as = new ArraySum(arr);
		Thread t1 = new Thread(as,"Thread-1");
		Thread t2 = new Thread(as,"Thread-2");

		System.out.println("Threads started");
		t1.start();
		t2.start();
		System.out.println("Sum is "+as.getSum());
	}
	
}

class ArraySum implements Runnable{
	
	private int index = 0;
	private int sum = 0;
	private int [] arr;
	
	public ArraySum(int [] arr){
		this.arr = arr;
	}
	
	public synchronized int getIndex(){
		return this.index;
	}
	
	public synchronized ArraySum setIndex(int index){
		 this.index = index;
		 return this;
	}
	
	public synchronized int getSum(){
		return this.sum;
	}
	
	public synchronized ArraySum setSum(int sum){
		 this.sum = sum;
		 return this;
	}
	
	@Override
	public void run(){
		synchronized (this){
			for(int i:arr){
				if(this.getIndex()==this.arr.length){
					return;
				}
				this.setSum(this.arr[this.getIndex()]+this.getSum());
				System.out.println("Thread running: " + Thread.currentThread().getName()+" {index} {value} {sum}"+this.getIndex()+" "+this.arr[this.getIndex()]+" "+this.getSum());
				this.setIndex(this.getIndex()+1);
			}


		}
	}
}
