class CharValidate 
{
    public static void main(String[] args) 
    {
        char ch = '+';
        if(Character.isDigit(ch))
            System.out.println("Number");
        if(Character.isLetter(ch))
            System.out.println("Alphabet");
        if(ch>=32 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=127)
            System.out.println("Special Charater");

    }    
}
