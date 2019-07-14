package C_Java;

abstract class abcs{
	abstract void abcd();
	//abstract void xx();
	
	public void m1()
	{
		System.out.println("I m non abstract method");
	}
	
}

public class Abstract_prog_1 extends abcs {
	
	public void abcd()
	{
		System.out.println("I m abstract class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_prog_1 obj = new Abstract_prog_1();
		obj.abcd();
		obj.m1();

	}

}
