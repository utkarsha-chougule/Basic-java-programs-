class Febonacci1
{
static int n1=0,n2=1,n3=10;
static void printfabonacci(int count)
  {
    if(count>0)
    { 
     n3=n1+n2;
     n1=n2;
     n2=n3;
     System.out.println(""+n3);
     printfabonacci(count-1);
     }
     }
 public static void main(String[]args)
 {
 int count =10;
 System.out.println(n1+""+n2);
}
}
   