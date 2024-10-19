package aggregration;

public class Aggregration_Class2 {

	String hobby;
	int rollno;
	Aggregraton_Class1 refv;//getting the variables of parent class
	public static void main(String[] args) {
	
		Aggregraton_Class1 obj=new Aggregraton_Class1("Kavya",13);//invoking parent class
		Aggregration_Class2 objt=new Aggregration_Class2("Dancing",2,obj);
		objt.display();

	}
	public Aggregration_Class2(String hobby,int rollno,Aggregraton_Class1 refv)
	{
		this.hobby=hobby;
		this.rollno=rollno;
		this.refv=refv;
	}
public void display()
{
	System.out.println(refv.name+" " +refv.age);
	System.out.println(hobby+" " +rollno);
}
}
