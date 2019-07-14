package C_Java;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arr = new ArrayList<String>();
		arr.add(0,"Amit");
		arr.add(1,"Amits");
		arr.add(2,"Amitss");
		arr.add(3,"Amitsss");
		arr.add(4,"Amitssss");
		
		int siz = arr.size();
		System.out.println(siz);

		for(int i=0; i<=arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
		}

	}

}
