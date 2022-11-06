import java.util.Scanner;
class OneOrFourArr 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //boolean result = true;
        int count = 0;int count1 = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] == 1)
                count++;//result = false;
            if(arr[i] == 4)
                count1++;
        }
        sc.close();
        System.out.println(count+count1==n?true:false);
    }
}
