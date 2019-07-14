package PassDataUsingConstructor;

public class first_1 {
	
	int price;
	
	
	public first_1(int rate)
	{
		this.price = rate;
	}
	
	public void display()
	{
		if(price == 100)
		{
			System.out.println("Price is 100");
		}
		else
		{
			System.out.println("Price is not 100");
		}
		
	}

}
