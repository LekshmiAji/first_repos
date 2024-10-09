package FirstMavenPackage;
import java.util.Scanner;

public class SampleMaven {

	public static void main(String[] args) {
		
		Scanner objt=new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int a=objt.nextInt();
		int b=objt.nextInt();
		//int a=10,b=20,c;
		int c=a+b;
		System.out.println("Sum is " +c);

	}

}
