
package Week9;
import java.util.Date;
public abstract class GeometricObject {

	private String color;
    private boolean filled;
    private Date dateCreated;
	
public GeometricObject()
{
	color = "red";
	filled = true;
	dateCreated = new Date();
	}
public String getColor()
{
	return color;
}
public void setColor(String c)
{
	color = c;
}
public boolean isFilled()
{
	return filled;
}
public void setFilled(boolean f)
{
	filled= f;
}
public Date getDateCreated()
{
	return dateCreated;
}
public String toString()
{
	return color +" " + filled+""+dateCreated;
}
public  abstract double getArea();
public  abstract double getPerimeter();
}

