class TwoDArrReverse 
{
    public static void main(String[] args) 
    {
        if(args.length<4)
            System.out.println("Please enter 4 integers");
        else
        {
            int[][] arr = new int[2][2];
            int index = 0;
            System.out.println("The given array is:");
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    arr[i][j] = Integer.parseInt(args[index]);
                    System.out.print(arr[i][j] + " ");
                    index++;
                }
                System.out.println();
            }
            System.out.println("The array reverse is:");
            for(int i=1;i>=0;i--)
            {
                for(int j=1;j>=0;j--)
                {
                    System.out.print(arr[i][j] + " ");
                    index++;
                }
                System.out.println();
            }
        }
    }
}
