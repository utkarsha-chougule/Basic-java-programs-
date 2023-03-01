class Meth1
{
	public static void main(String[]args)
	{
		System.out.println("START");
		int a=300;
		double b=300.5;
		 System.out.println("The Result of Addition Is"+method(a,b));
		 System.out.println("STOP");
	}
	static double method(int a, double b)
	{
		System.out.println("Inside Method1");
		return a+b;

	}
}