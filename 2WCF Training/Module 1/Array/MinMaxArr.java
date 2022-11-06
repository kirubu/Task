import java.util.Scanner;
class MinMaxArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];
        int min = arr[0] = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(max<arr[i])
                max = arr[i];
            if(min>arr[i])
                min = arr[i];
        }
        System.out.println(max+" "+min);
        sc.close();
    }
}