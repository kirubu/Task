import java.util.Scanner;
class DuplicateArr 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<n;)
        {
            int temp = arr[i];
            int count = 0;
            while(i<n && arr[i]==temp)
            {
                i++;
                count++;
            }
            System.out.print(temp+" ");
        }
    }
}
