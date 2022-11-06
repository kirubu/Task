import java.util.Scanner;
class WithoutTen 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]!=10)
            {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        for(int i=0;i<n-count;i++)
            System.out.print("0 ");
        sc.close();        
    }    
}
