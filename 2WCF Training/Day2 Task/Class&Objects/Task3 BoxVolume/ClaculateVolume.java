import java.util.Scanner;
public class ClaculateVolume 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();
        Box box = new Box(width,height,depth);
        System.out.println(box.volume(width,height,depth));    
    }    
}
