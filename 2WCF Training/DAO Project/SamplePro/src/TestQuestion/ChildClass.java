package TestQuestion;

class ParentClass
{
	public int doStuff(int x)
	{
		return x*2;
	}
}
public class ChildClass extends ParentClass
{
	public int doStuff(int x)
	{
		return x*3;
	}
	public static void main(String[] args) 
	{
		ChildClass cc = new ChildClass();
		System.out.println(cc.doStuff(5));
	}
}
