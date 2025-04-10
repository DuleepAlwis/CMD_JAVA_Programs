import java.util.*;

public class Java17F{
	
	public static void main(String [] args){
		
		Object o = "Hello";
		List<Object> objects = new ArrayList<Object>();
		objects.add("Hello");
		objects.add(1);
		objects.add(null);
		objects.add(1.1);
		
		for(int j=0;j<objects.size();j++){
			o = objects.get(j);
			switch(o){
				case String s->System.out.println("Hi, I am a string " +s);
				case Integer i->System.out.println("Hi, I am an integer " +i);
				case null -> System.out.println("Hi,I am null");
				case default->System.out.println("Hi, I am default block");
			}
		}
		
	}
	
	
}


