
public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p;
		p = new Person();
		//ref_name.nameof function
		//p.setValues();
		
		p.display();
		
		p.setAge(101);
		p.display();
		
		Person p1;
		p1 = new Person(45,"TonyStark");
		
		//p1.setValues(24, "abc");
		p1.display();
		//p1.setValues(45, "tonyStark");
		//p1.display();
		
	}

}
