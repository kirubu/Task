package TestQuestion;

class MySuperClass
{
	Message msg = new Message();
}
class Message
{
	String text = "Hello world";
}
public class MyClass extends MySuperClass 
{
	public static void main(String[] args) 
	{
		MyClass obj = new MyClass();
		obj.print();

	}
	public void print()
	{
		System.out.println(msg.text);
	}

}
