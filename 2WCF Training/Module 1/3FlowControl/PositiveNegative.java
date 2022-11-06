import java.util.Scanner;
class PositiveNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0)
		    System.out.println(n+" positive number");
		if(n==0)
		    System.out.println(n+" is zero");
		if(n<0)
		    System.out.println(n+" negative number");
	}
}
