package exception_example;

public class Exception1 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
		int c=a/b;
		
		System.out.println(c);
		}
		/*catch(ArithmeticException x)
		{
			int d=a+b;
			System.out.println(d);
			System.out.println(x);
		}*/
		finally
		{
			System.out.println("Execution completed");
		}
		
	}

}
