import java.util.Scanner;
class AlternateCharTwoString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int i = 0;
        for(;i<str1.length();i++)
        {
            if(i<str2.length())
                System.out.print(str1.charAt(i)+""+str2.charAt(i));
            else
                System.out.print(str1.charAt(i));
        }
        if(i<str2.length())
            System.out.print(str2.substring(i));
    }    
}
