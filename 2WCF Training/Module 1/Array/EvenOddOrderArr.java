import java.util.Scanner;
class EvenOddOrderArr 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        String even = "";
        String odd = "";
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0)
                even+=arr[i]+" ";
            else
                odd+=arr[i]+" ";
        }
        sc.close();
        System.out.println(even+odd);
    }    
}
