import java.util.Scanner;
class CheckCMDArgs
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(args.length == 0)
		    System.out.println("No values");
		else
		    for(String arg:args)
		        System.out.print(arg+",");
	}
}
