package arraylist;
import java.util.*;
public class hashtable {
	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1274,"Jhaveri");  
		  hm.put(1275,"Mounika");  
		  hm.put(1276,"Tejaswi");  
		  hm.put(1277,"Lakshmi");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}
}