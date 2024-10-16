package collection;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set {

	public static void main(String[] args) {

Set<String> s=new HashSet<>();
s.add("Lekshmi");
s.add("Ammu");
s.add("Sivani");
s.add("Kunjatta");
s.add("Halo");
s.add("Welcome");

System.out.println("The String elements in the set are: "+s);
System.out.println("...................................................");
System.out.println("The word LEKSHMI exists or not: " +s.contains("Lekshmi"));

System.out.println("The removed element AMMU from the Set: " +s.remove("Ammu"));
System.out.println("The New Set is: " +s);
Set<Integer> data =new HashSet<>();
data.add(10);
data.add(100);
data.add(1000);
data.add(10000);
System.out.println("...................................................");
System.out.println("The integer numbers in the set are: "+data);
	}

}
