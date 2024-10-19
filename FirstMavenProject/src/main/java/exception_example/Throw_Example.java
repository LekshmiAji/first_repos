package exception_example;

public class Throw_Example {

	public static void main(String[] args) {
int age=4;
if(age>=18)
{
	System.out.println("The Candidate is eligible for voting");
}
else
{
throw new ArithmeticException("Age under 18");
}

		
	}

}
