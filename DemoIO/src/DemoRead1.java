import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class DemoRead1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("enter number 1 :");
			int  num1 = Integer.parseInt(br.readLine());
			System.out.println("enter number 2 :");
			int num2 = Integer.parseInt(br.readLine());
			
			
			System.out.println(Math.max(num1, num2));
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
