import java.util.Scanner;
class Tiles 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(tileJump(arr));
    }
    public static boolean tileJump(int[] arr)
    {
        int n = arr.length;
        int i=0;
        if(arr.length==1 && arr[i]==0)
            return true;
        else
        {
            
            for(;i<n;i++)
            {
                if(i+arr[i]<n || i+arr[i]>n)
                    i=arr[i];
                if(i<n && arr[i]==0)
                    return false;
            }
        }
        if(i>=n)
            return true;
        else
            return false;
    } 
}
