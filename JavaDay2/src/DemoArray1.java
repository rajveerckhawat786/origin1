
public class DemoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers;
		numbers = new int[3];
		numbers[0] = 0;
		//System.out.println(numbers);
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 100;
		//numbers[3] = 1000;
		//System.out.println(numbers[0]);
		//System.out.println(numbers[1]);
		//System.out.println(numbers[2]);
		//System.out.println(numbers[3]);
		
		int [] numbers2;
		numbers2 = new int[5];
		numbers2[0] = 10;
		numbers2[1] = 20;
		numbers2[2] = 30;
		numbers2[3] = 40;
		numbers2[4] = 50;
		
		int sum = add(numbers);
		
		System.out.println("sum = "+ sum);
		
		for(int i =0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
	}
		
		public static int add(int[] numbers) 
		{
			return(numbers[0] + numbers[1]+numbers[2]) ;
		}
		
		
	}


