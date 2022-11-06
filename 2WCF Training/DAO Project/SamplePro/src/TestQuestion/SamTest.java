package TestQuestion;
class A{}
class B extends A{}
class C extends B{}

public class SamTest 
{
	public static void main(String[] args) 
	{
		System.out.println(new SamTest().doSomething().getClass().getName());
	}
	public B doSomething()
	{
		return new C();
	}
}
