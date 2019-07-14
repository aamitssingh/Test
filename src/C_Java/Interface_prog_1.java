package C_Java;


interface abc{
	void show();
	void display();// class must have to implement this even with blank body
}

interface xyz{
	//void aa();
	//void bb();
}

public class Interface_prog_1 implements abc,xyz {
	
	public void show()
	{
		System.out.println("hellow");
	}
	
	public void display()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_prog_1 obj =new Interface_prog_1();
		obj.show();

	}

}
