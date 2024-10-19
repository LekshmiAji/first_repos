package collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("Hai");
		s.add("Hallo");
		s.add("Apple");
		s.add("Orange");
		System.out.println("The array elements are: "+s);
		
		ArrayList<String> s1=new ArrayList<String>();
s1.add("Red");
s1.add("Yellow");
s.addAll(s1);

System.out.println("The total elements are : "+s);

System.out.println(s.contains("Hai"));
System.out.println(s.get(3));
System.out.println(s.isEmpty());
s.remove(3);
System.out.println(s);
System.out.println(s.size());

	}

}
