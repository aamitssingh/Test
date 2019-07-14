package C_Java;

public class prac_1 {
	
	public static void main(String args[])
	{
		
		int a =135;
		int orgno = a;
		int x = a%10; //5
		a = a/10;
		int y = a%10; //3
		a= a/10;
		int z=a;//1
		
		int sum = z +(y*y)+(x*x*x);
		
		if(sum == orgno)
		{
			System.out.println(orgno +" is disarrum");
		}
		else
		{
			System.out.println(orgno +" is not disarrum");
		}
		//System.out.println(a);
		//System.out.println(b);
	}

}
