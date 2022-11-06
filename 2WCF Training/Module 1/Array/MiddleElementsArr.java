import java.util.Scanner;
class MiddleElementsArr 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] mid = new int[2];
        for(int i=0;i<3;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<3;i++)
            b[i] = sc.nextInt();
        mid[0] = a[1];
        mid[1] = b[1];
        System.out.println(mid[0]+","+mid[1]);
    }    
}
