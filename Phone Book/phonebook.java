import java.util.*;
public class MyDictionary 
		{
			
	public static void main(String[] args) 
	
	{
           Dictionary<String, Integer> pb = new Hashtable<String, Integer>();
           pb.put("Aman", 12);
           pb.put("Piyush", 45);
           pb.put("Rohit",14);
           pb.put("Ayush",17);
           System.out.println(pb);
           System.out.println(pb.get("Aman"));
           System.out.println(pb.get("Dhingra"));
		   System.out.println(((Hashtable<String, Integer>)pb).containsKey("ABC"));
           //all keys of the Hashtable
           System.out.println(((Hashtable<String, Integer>) pb).keySet());
           //values from Hashtable
           System.out.println(((Hashtable<String, Integer>) pb).values());

           //the quantity of records
           System.out.println(pb.size());
           //removing single record
           pb.remove("Ayush");
           System.out.println(pb);
       }
   }