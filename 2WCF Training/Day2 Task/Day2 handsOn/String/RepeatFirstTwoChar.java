import java.util.Scanner;
class RepeatFirstTwoChar 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        if(str.length()>=2)
        {
            StringBuffer sb = new StringBuffer(str.substring(0,2));
            for(int i = 1;i<str.length();i++)
                sb.append(str.substring(0,2));
            System.out.println(sb.toString());
        }
        else
            System.out.println("String length is not 2");

    }
}
