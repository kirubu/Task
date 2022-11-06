import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.nextLine());
        String reverse = str.reverse().toString();
        String normal = str.reverse().toString();
        if(reverse.equals(normal))
            System.out.println(normal+ " is Palindrome");
        else
            System.out.println(normal+ " is Not Palindrome");

    }
}