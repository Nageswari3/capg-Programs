package day3;

public class Demo1 {
public void sum(int x, int y) {
	System.out.println("integer sum is : "+(x+y));
}
public void sum(double x, int y) {
	System.out.println(" sum is : "+(x+y));
}
public static void main(String[] args)
{
	Demo1 obj ;
	obj = new Demo1();
	obj.sum(3.4, 8);
	obj.sum(3, 4);
}
}
