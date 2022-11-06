import java.util.Scanner;
class SearchElementArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = -1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int find = sc.nextInt();
        for(int i=0;i<n;i++)
            if(arr[i] == find)
                result = i;
        System.out.println(result);
        sc.close();
    }
}