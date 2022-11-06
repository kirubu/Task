
public class Box {
    double width,height,depth;
    Box(double width,double height,double depth)
    {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }    
    public double volume(double width,double height,double depth)
    {
        return width*height*depth;
    }
}
