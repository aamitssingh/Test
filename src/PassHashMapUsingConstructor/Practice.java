package PassHashMapUsingConstructor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice {
	
	HashMap<Integer,String> map1;  
	int val = 100;
	 
	Practice(){} 
	   
	Practice(HashMap<Integer,String> map1)
	{
		this.map1=map1;
	}

	public HashMap getMap()
	{
		return map1;
	}
	
	
	public void Keys_Values()
	{
		Set set = map1.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	       Map.Entry mentry = (Map.Entry)iterator.next();
	       //System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	       //System.out.println(mentry.getValue());
	       
	       int key = (int)mentry.getKey();
	       String value = (String)mentry.getValue();
	       if(val == key)
	       {
	    	   System.out.println("Value is matching and value ="+key);
	    	   break;
	       }
	       else
	       {
	    	   //System.out.println("Value is not matching");
	    	   continue;
	       }
	       
	    }
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");
	      
	       Practice p= new Practice(map);
		 
		 HashMap <Integer,String> map2= p.getMap();
		 
		 System.out.println("Initial list of elements: "+map2);  
		 
		 System.out.println("Value matching start");
		 p.Keys_Values();
		 

	}

}

