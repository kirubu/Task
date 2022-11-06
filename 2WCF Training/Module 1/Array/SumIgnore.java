import java.util.Scanner;
class SumIgnore
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int indexSix = 0, indexSeven = 0, sum = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            if(arr[i] == 6)
                indexSix = i;
            if(arr[i] == 7)
                indexSeven = i;
        }
        System.out.println(indexSix+" "+indexSeven);
        if(indexSeven - indexSix>0)
        {
            for(int i = indexSix;i<=indexSeven;i++)
            sum = sum - arr[i];
        }
        System.out.println(sum);
        sc.close();

    }
}