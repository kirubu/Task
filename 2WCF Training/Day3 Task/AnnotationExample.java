import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Xyz
{
    String value() default "Microsoft";
}
@Xyz("Wipro Tech")
class B
{
    void d()
    {
        
    }
    
}
public class AnnotationExample{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Annotation[] c=B.class.getAnnotations();
        
        for(Annotation a: c)
        {
            Xyz x=(Xyz)a;
            System.out.println("Value="+x.value());
        }
    }
}