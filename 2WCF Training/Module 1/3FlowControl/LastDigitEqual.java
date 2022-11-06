import java.util.Scanner;
class LastDigitEqual
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		if(n%10 == n1%10)
		    System.out.println("true");
		else
		    System.out.println("false");
	}
}
