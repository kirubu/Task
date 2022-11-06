import java.util.Scanner;
class TwoMinMaxArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max,max1,min,min1;
        int[] arr = new int[n];
        min1 = min = 99999;
        max1 = max = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(max<arr[i] || max1<arr[i])
            {
                max1 = max;
                max = arr[i];
                //System.out.println(max+" "+max1);
            }

            if(min>arr[i]) 
            {
                min1 = min;
                min = arr[i];
            }
            else if((min1>arr[i] && min1>min))
                min1 = arr[i];
            else;
        }
        System.out.println(max+" "+max1);
        System.out.println(min+" "+min1);
        sc.close();
    }
}