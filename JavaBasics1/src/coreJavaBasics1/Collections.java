package coreJavaBasics1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<String> a=new ArrayList<String>();
		 a.add("rahul");
		 a.add("java");
		 a.add("java");
		 a.add("susana");
		 System.out.println(a);
		 a.add(0, "student");
		 System.out.println(a);
		 a.remove(1);
		 a.remove("java");
		 System.out.println(a);
		 System.out.println(a.get(2));
		 System.out.println(a.contains("java")); 
		 System.out.println(a.indexOf("rahul"));
		 System.out.println(a.isEmpty()); 
		 System.out.println(a.size());
		 System.out.println(a);
		 
		 // HashSet
		 //    No permite valores duplicados
		 //    No garantiza recorrer en orden
		 HashSet<String> s = new HashSet<String>();
		 s.add("Alex");
		 s.add("susana");
		 s.add("Aracelly");
		 s.add("Leon Fernando");
		 s.add("Alex"); 
		 
		 Iterator<String> i = s.iterator();
		 while (i.hasNext()) {
			System.out.println(i.next());
		}
		 
		 // HashMap
		 Object HashMap;
		 HashMap<Integer,String> m = new HashMap<Integer,String>();
		 m.put(0, "Buenas");
		 m.put(1, "como");
		 m.put(42, "estas");
		 m.put(3, "bien");
		 System.out.println(m);
		 System.out.println(m.get(0)); //buenas
		 
		 Set sn = m.entrySet();
		 Iterator it = sn.iterator();
		 while (it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println("llave: " + mp.getKey());
			System.out.println("\tvalor: " + mp.getValue());
		}

	}

}
