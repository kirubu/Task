class CharCaseChange
{
    public static void main(String[] args) 
    {
        char ch = 'p';
        if(ch>=65 && ch<=90)
            System.out.print((char)(ch+32));
        else if(ch>=97 && ch<=122)
            System.out.print((char)(ch-32));
        else
            System.out.println("Enter a alphabet");
    }
}