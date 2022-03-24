package day3;

public class Demo9 {
public static void main(String[]  args)
{
	Bank obj = new IciciBank();
	System.out.println("Icici Bank intrest is :" +obj.getRateOfIntrest());
	Bank obj1 = new CityBank();
	System.out.println("City Bank intrest is :" +obj.getRateOfIntrest());
	
}
 
}
