
public class DemoStatic {

	
	private int age;
	private String name;
	
	private static int value;
	
	public DemoStatic() {
		// TODO Auto-generated constructor stub
		age = 32;
		name = "qwerty";
		value++;
		
	}
	
	static {
		value = 0;
	}
	
	public void display()
	{
		System.out.println(name+"\t"+age +"\t"+ value);
	}
	
	public static void show()
	{
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		DemoStatic.show();
		
		
		DemoStatic d1 = new DemoStatic();
		DemoStatic d2 = new DemoStatic();
		DemoStatic d3 = new DemoStatic();
		DemoStatic d4 = new DemoStatic();
		DemoStatic d5 = new DemoStatic();
		
		d2.show();
		
		
	}
	
	
	
}
