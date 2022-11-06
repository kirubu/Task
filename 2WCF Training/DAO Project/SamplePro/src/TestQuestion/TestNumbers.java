package TestQuestion;
class Numbers
{
	public Integer getValue()
	{
		return 23;
	}
}
public class TestNumbers {

	public static void main(String[] args) {
		Numbers[][] num = new Numbers[2][2];
		System.out.println(num[1][0].getValue());
	}

}
