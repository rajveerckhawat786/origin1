
public class Demo1D_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person [] persons;
		persons = new Person[5];
		persons[0] = new Person(12,"hello");
		persons[1] = new Person(43,"alan");
		persons[2] = new Person(76,"enigma");
		persons[3] = new Person(324,"thor");
		persons[4] = new Person(2345,"themiscira");
		
		//persons[0].display();
		
		//System.out.println(persons[4].getName()+ "\t" +persons[4].getAge());
		
		for(Person x : persons)
		{
			x.display();
		}
		

	}

}
