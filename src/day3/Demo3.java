package day3;

public class Demo3 extends Demo2 {
	@Override
	public void sum(int a, int b)
	{
		System.out.println("substraction is:" + (a-b));
		}
	public static void main(String[] args)
	{
		Demo2 obj ;
		obj = new Demo2();
		obj.sum(5, 8);
		obj.sum(3, 4);
	}
}
