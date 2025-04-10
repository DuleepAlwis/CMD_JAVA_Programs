public class ComputerFactory{

	
	public static void main(String [] args){
		
		Computer pc = new PC("8GB","128GB","i3");
		Computer server = new PC("256GB","1GB","i9");
		
		System.out.println("--------------------------------");
		System.out.println("PC "+pc);
		System.out.println("Server "+server);
		System.out.println("--------------------------------");
	}
}

abstract class Computer{
	
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRam()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}

class PC extends Computer{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	
	public PC(String ram,String hdd,String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public String getRam(){
		return this.ram;
	}
	
	@Override
	public String getHDD(){
		return this.hdd;
	}
	
	@Override
	public String getCPU(){
		return this.cpu;
	}
	
}

class Server extends Computer{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	
	public Server(String ram,String hdd,String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public String getRam(){
		return this.ram;
	}
	
	@Override
	public String getHDD(){
		return this.hdd;
	}
	
	@Override
	public String getCPU(){
		return this.cpu;
	}
	
}
