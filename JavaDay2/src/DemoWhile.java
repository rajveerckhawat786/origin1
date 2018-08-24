
public class DemoWhile 
{
	
	public static void main(String[] args)
	{
		int[] array = {12,34,56,43,56,32,56,24,77,46,89};
		
		
		int i = 0;
		while(i<11)
		{
			System.out.print(array[i]+"\t");
			i++;
		}
		System.out.println();
		
		int count = 0;
		i = 0;
		int search = 56;
		boolean flag = false;
		while(i<array.length) 
		{
			
			if(array[i] == search)
			{
				flag = true;
				count++;
				
			}
			i++;
			
			
		}
		
		if(flag)
		{
			System.out.println("value found\t"+count+"\t times");
		}
		else
			System.out.println("value not found");
		
		
		
				
	}

}
