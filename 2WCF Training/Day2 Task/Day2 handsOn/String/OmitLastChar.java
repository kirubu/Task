import java.util.Scanner;
public class OmitLastChar 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2  =sc.next();
        char ch1 = str1.toLowerCase().charAt(str1.length()-1);
        char ch2 = str2.toLowerCase().charAt(0);
        System.out.println(ch1+" "+ch2);
        if(ch1==ch2)
            System.out.println(str1+(str2.substring(1)));
        else
            System.out.println(str1+str2);
    }    
}
