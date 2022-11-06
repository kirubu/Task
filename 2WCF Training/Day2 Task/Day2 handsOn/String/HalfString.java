import java.util.Scanner;

class HalfString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();sc.close();
        if(str.length()%2==0)
            System.out.print(str.substring(0, str.length()/2));
        else
            System.out.println("null");
    }    
}
