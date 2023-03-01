class marriage
{
  public static void main(String[]args)
   {
    int age=23;
    char gender= 'm';
    if((gender=='f' && age>=18) ||(gender=='m' && age>=21))
    {
    System.out.println("you are eligible");
    }
    else
    {
	System.out.println("you are not eligible");
     }
   }
}