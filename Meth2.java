class Meth2
{
 public static void main(String[]args)
 {
  System.out.println("START");
   short a=1;
   short b=1;
   //short result=method(a,b);
    //System.out.println("The Value of Result"+result);
	int c = method(a,b);
	System.out.println(c);
	System.out.println("STOP");
}
static int method(short x,short y)
	{
		return x + y;	
	}
}