import java.util.Scanner;

class CountOfOccurence 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int x = sc.nextInt();
        sc.close();
        System.out.print(str);
        for(int i=1;i<x;i++)
            System.out.print(str2+str);
    }    
}
