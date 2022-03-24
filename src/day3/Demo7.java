package day3;

public class Demo7 extends Demo6 {
	public Demo7()
	{
		super(300);
	}
   @Override
   public void sum()
   {
	   System.out.println("I am sum");
   }
   @Override
   public void sub()
   {   
	   
	   System.out.println("I am sub");
   }
   public static void main(String[] args)
   {
	   Demo7 obj = new Demo7();
	   obj.sum();
	   obj.sub();
   }
}
