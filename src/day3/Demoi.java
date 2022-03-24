package day3;

public class Demoi implements i2{
	@Override
	public void sum(int x, int y) {
		System.out.println("sum:"+(x+y));
	}
	@Override
	public void sub(int x, int y) {
		System.out.println("sub:"+(x-y));
	}
	public static void main(String[] args)
	{
		i2 obj = new Demoi();
		obj.sum(45, 45);
		obj.sub(34,5);
		
	}
}
