package Week9;
import java.util.Scanner;
public class GeoDriver {

	public static void main(String[] args) {
	
		Circle c = new Circle();
				double radius;
				System.out.println("Circle : ");
				System.out.println("Enter the radius");
				Scanner sc = new Scanner (System.in );
				radius = sc.nextDouble();
				//Circle c= new Circle (radius);
				c.setRadius(radius);
				System.out.println("Area of Circle is" + c.getArea());
		System.out.println("Perimeter of Circle is" + c.getPerimeter());
		System.out.println("");

		Rectangle r = new Rectangle();
		double width, height;
		System.out.println(" Rectangle : ");
		System.out.println("Enter the width");
		width = sc.nextDouble();
		System.out.println("Enter the heigtht");
		height = sc.nextDouble();
		r.setHeight(height);
		r.setWidth(width);
		System.out.println("Area of Rectangle is" + r.getArea());
		System.out.println("Perimeter of Rectangle is" + r.getPerimeter());
		
		System.out.println("");
		Triangle t =  new Triangle ();
		double side1, side2, side3;
		boolean filled;
		Scanner input = new Scanner (System.in );
		System.out.println(" Triangle :");
		System.out.println("Enter the value of side1");
		side1 = input.nextDouble();
		System.out.println("Enter the value of side2");
		side2 = input.nextDouble();
		System.out.println("Enter the value of side3");
		side3 = input.nextDouble();
		System.out.println("Enter the color of triangle");
		String color = input.next();
		System.out.println("Is triangle filled or not ? Answer with typing True or False:");
		filled = input.nextBoolean();
		t.setSide1(side1);
		t.setSide2(side2);
		t.setSide3(side3);
		t.setFilled(filled);
		t.setColor(color);
		System.out.println("Area of Triangle is " + t.getArea());
		System.out.println("Perimeter of Triangle is " + t.getPerimeter());
		System.out.println("Its Color is :" + t.getColor());
		System.out.println(" Is triangle filled or not ? " + t.isFilled());
		
	}

}
