import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FileWriter fileWr;
		try {
			fileWr = new FileWriter("abc.txt",true);
			fileWr.write("City,Pune");
			System.out.println("daal diya beh");
			fileWr.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
