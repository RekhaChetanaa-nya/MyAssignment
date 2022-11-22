package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		int add=cal.add(5, 10, 55);
		System.out.println(add);
		int sub=cal.sub(23, 14);
		System.out.println(sub);
		double mul=cal.mul(23.4, 52.6);
		System.out.println(mul);
		float divide=cal.divide(23.4f, 16.5f);
		System.out.println(divide);
	}

}
