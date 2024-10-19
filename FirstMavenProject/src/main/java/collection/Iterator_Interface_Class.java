package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Interface_Class {

	public static void main(String[] args) {

ArrayList<String> s=new ArrayList<String>();
s.add("Hai");
s.add("Hallo");
s.add("Apple");
s.add("Orange");
//System.out.println("The array elements are: "+s);
Iterator it=s.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
it.remove();
System.out.println(s);
	}

}
