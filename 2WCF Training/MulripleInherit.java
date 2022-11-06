interface Arithemetic
{
    int add(int a, int b);
    int sub(int a, int b);
}
interface Power
{
    double powDouble(double a,double b);
}
interface Calculator extends Arithemetic,Power
{
    void calculate();
}
public class MulripleInherit implements Calculator
{
    public static void main(String[] args) {
        MulripleInherit obj = new MulripleInherit();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.sub(10, 20));
        System.out.println(obj.powDouble(10, 20));
    }
    public int add(int a, int b){return a+b;}
    public int sub(int a, int b){return a-b;}
    public double powDouble(double a,double b){return Math.pow(a,b);}
    public void calculate(){System.out.println("calculate all");}
}
    

