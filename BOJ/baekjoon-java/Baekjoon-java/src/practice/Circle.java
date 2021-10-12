package practice;

public class Circle {
	public static void main(String[] args) {
		Circle2 c1 = new Circle2();
		Circle2 c2 = new Circle2();
		
		c1.radious = 10.0;
		c2.radious = 5.5;
		
		zero(c1);
		System.out.println(c1.radious);
		zero(c2.radious);
		System.out.println(c2.radious);
	}
	
	public static void zero(Circle2 c) {
		c.radious = 0.0;
	}
	public static void zero(double r) {
		r = 0.0;
	}
}

class Circle2{
	double radious;
	
	double findArea() {
		return 3.14 * radious * radious;
	}
}
