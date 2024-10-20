package collection;

import java.util.ArrayList;

public class Color_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Pink");
		color.add("Orange");
		System.out.println("The colors in the arraylist are: "+color);
		
		System.out.println("The 5th index item is: " +color.get(5));
		
		System.out.println("Iterating through the elements in an array list..........");
		for(int i=0;i<color.size();i++)
		{
			System.out.println(color.get(i));
			
		}
		System.out.println("Removing the third element from the arraylist: "+color.remove(2));
		
		System.out.println("Searching 'Pink' item in the arraylist: "+color.contains("Pink"));
		

	}

}
