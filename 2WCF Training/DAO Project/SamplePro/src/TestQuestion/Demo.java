package TestQuestion;

public class Demo 
{
	public static void main(String[] args) 
	{
		int variable1 = 10;
		do
		{
			if(variable1==10)
				break;
			else
			{
				variable1++;
				System.out.println(variable1);
			}
		}while(variable1<10);
	}
}
