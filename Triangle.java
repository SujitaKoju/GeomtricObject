package Week9;

public class Triangle extends GeometricObject {

	public String color;
    public boolean filled;
    double side1, side2, side3;
    
    public Triangle()
    {
    	side1=1;
    	side2=1;
    	side3=1;
    	
    }
    
    public Triangle(double s1, double s2, double s3, boolean f )
    {
    	side1=s1;
    	side2=s2;
    	side3=s3;
    	filled= f;
    	
    }
    public double getSide1 ()
    {
    	return side1;
    }
    public void setSide1(double s1)
    {
    	side1=s1;
    }
    public double getSide2 ()
    {
    	return side2;
    }
    public void setSide2(double s2)
    {
    	side2=s2;
    }
    public double getSide3()
    {
    	return side3;
    }
    public void setSide3(double s3)
    {
    	side3=s3;
    }
    public boolean isFilled()
    {
    	return filled;
    }
    public void setFilled (boolean f)
    {
    	filled=f;
    }
    public String getColor()
    {
    	return color;
    }
    public void setColor(String c)
    {
    	color=c;
    }
    public double getArea() {
		
    	double s= (side1+side2+side3)/2;
    	double area;
	     area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}

	
	public double getPerimeter() {
	
		return (side1+side2+side3);
	}

}
