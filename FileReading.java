import java.io.*;

public class FileReading{

	public static void main(String [] args){
		
		File file = new File("FileReading.java");
		
		
		String line;
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line= br.readLine())!=null){
			System.out.println(line);
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
	}
}
