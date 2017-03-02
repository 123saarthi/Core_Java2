public class Box 
{
  private double width,height,depth;// we have to make the var tightly encapsulated 
  public double getWidth() 
{
	return width;
}
  public void setWidth(double width) 
{
	this.width = width;
}
public double getHeight()
{
	return height;
}
public void setHeight(double height)
{
	this.height = height;
}
public double getDepth() 
{
	return depth;
}
public void setDepth(double depth) 
{
	this.depth = depth;
}
public double vol()
{ return depth*height*width;
}
}
