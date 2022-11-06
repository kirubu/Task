class TwoDMax3X3 
{
    public static void main(String[] args) 
    {
        if(args.length<9)
            System.out.println("Please enter 4 integers");
        else
        {
            int[][] arr = new int[3][3];
            int index = 0;int max = 0;
            System.out.println("The given array is:");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    arr[i][j] = Integer.parseInt(args[index]);
                    index++;
                    System.out.print(arr[i][j]+"  ");
                    if(max<arr[i][j])
                        max = arr[i][j];
                }
                System.out.println();
            }
            System.out.println("The biggest number in given array is :"+max);
            
        }
    }
}
