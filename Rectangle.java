package Week9;

public class Rectangle extends GeometricObject {
private double width;
private double height;
public Rectangle()
{
	width = 1;
	height = 1;
}

public Rectangle (double w, double h)
{
	width= w;
	height=h;
	
}
public double getWidth ()
{
	return width;
}
public void setWidth(double w)
{
	width=w;
}

public double getHeight ()
{
	return height;
}
public void setHeight(double h)
{
	height=h;
}
	public double getArea() {
		
		return  height * width;
	}


	public double getPerimeter() {
		
		return 2 * (height + width) ;
	}

}
