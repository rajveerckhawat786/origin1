import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name = "citi";
		System.out.println("initial value of nAME : "+name);
		//name = name.concat(",Pune");
		//System.out.println("value for name after concatenation :"+name);
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("enter your name : ");
		name = s.next();
		System.out.println("your name contains : "+name.length()+"  letters");
		System.out.println("enter your surname : ");
		name = name.concat(" "+ s.next());
		System.out.println("your full name is : "+name);
		
		System.out.println("your substring : " + name.substring(2, 7));
		System.out.println("character at 6th position = "+name.charAt(6));
		System.out.println(name.toLowerCase());
		*/
		String name1 = "citi";
		if(name1==name)
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}

	}

}
