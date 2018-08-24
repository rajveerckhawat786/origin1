import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] numbers = {123,45,65,75,23,678,346,987,43,23,8,76,901,346};
		//Arrays.fill(numbers, 0);
		
		for(int num:numbers)
		{
			System.out.print(" "+num);
		}
		
		Arrays.fill(numbers,2, 6, 0);
		System.out.println();
		
		for(int num:numbers)
		{
			System.out.print(" "+num);
		}
		
		int[] arr_copy = Arrays.copyOf(numbers, 10);
		System.out.println();
		
		
		for(int num:arr_copy)
		{
			System.out.print(" "+num);
		}
		
		String[] names = {"Abc","pqr","xyz"};
		
		String[] names1 = {"AbC","pqr","xyz"};
		
		System.out.println();
		boolean data = Arrays.equals(names, names1);
		if(data)
		{
			System.out.println("two arrays are equal");
		}
		
		System.out.println();
		Arrays.sort(numbers);
		for(int num:numbers)
		{
			System.out.print(" "+num);
		}
		
		
		System.out.println();
		
		int index = 0;
		index = Arrays.binarySearch(numbers, 901);
		
		System.out.println(index);
		
		
	}

}
