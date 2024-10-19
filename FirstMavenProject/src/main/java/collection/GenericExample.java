package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {

List <String> s=new ArrayList<String>();
s.add("Yellow");
s.add("Red");
s.add("White");
s.add("Yellow");
System.out.println(s);
s.set(1, "Black");
System.out.println(s);
System.out.println(s.indexOf("Yellow"));
System.out.println(s.lastIndexOf("Yellow"));
s.remove(2);
System.out.println(s);
System.out.println(s.get(2));

System.out.println(s.contains("Green"));


	}

}
