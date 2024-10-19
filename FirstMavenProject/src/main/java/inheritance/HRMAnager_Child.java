package inheritance;

public class HRMAnager_Child extends Employee_Parent{

	public static void main(String[] args) {
		HRMAnager_Child objt=new HRMAnager_Child();
		objt.work(90,30);

	}
	public void work(int a,int b)
	{
		super.work(30,60);
		int c=a*b;
		System.out.println("Employee details "+c);
		
	}

}
