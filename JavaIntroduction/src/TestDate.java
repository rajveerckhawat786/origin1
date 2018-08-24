
public class TestDate {
	
	public static void main(String[] args)
	{
		Date date1,date2;
		date1 = new Date();
		date1.display();
		
		date2 = new Date(15,8,1947);
		date2.display();
		
		
		date1.setDay(12);
		date1.setMonth(12);
		date1.setYear(2012);
		date1.display();
	}

}
