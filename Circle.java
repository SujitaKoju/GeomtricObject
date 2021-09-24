package Week9;

public class Circle extends GeometricObject {
	
	private double radius;
	
    public Circle ()
{
	radius = 1;
}
    public double getRadius()
    {
    	return radius;
    }
    public void setRadius(double r)
    {
    	radius= r;
    }
    
    public Circle (double r)
{
	radius = r;
}

	
	public double getArea()
	{
		
	return Math.PI*radius*radius;
	}
	
	public double getPerimeter() 
	{	
		return 2*Math.PI* radius;
	}

}
