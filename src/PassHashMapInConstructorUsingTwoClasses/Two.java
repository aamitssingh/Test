package PassHashMapInConstructorUsingTwoClasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Two extends one {
	
	static HashMap<Integer,String> map1;  
	
	static int tota_Price = 100;
	static String element_txt = "Amit";
	
	public Two(HashMap<Integer,String> map)
	{
		this.map1 = map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		one obj = new one();
		obj.setMap();
		
		Set set = map1.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry)iterator.next();
			
			int price = (int)mentry.getKey();
			String txt = (String)mentry.getValue(); 
			
			if(price == tota_Price && txt.equals(element_txt) )
		       {
		    	   System.out.println("Final Price is matching and Price ="+price);
		    	   System.out.println("Element's Text is matching and Text ="+txt);
		    	   break;
		       }
		       else
		       {
		    	   //System.out.println("Value is not matching");
		    	   continue;
		       }
		}
		

	}

}
