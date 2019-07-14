package PassHashMapInConstructorUsingTwoClasses;

import java.util.HashMap;

public class one {
	
	
	public  void setMap()
	{
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(100, "Amit");
		map1.put(101, "Taj");
		map1.put(102, "Rahul");
		
		Two obj = new Two(map1);
	}

}
