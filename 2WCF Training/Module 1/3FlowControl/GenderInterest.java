class GenderInterest 
{
    public static void main(String[] args) 
    {
        if(args.length>0)
        {
            String gender = args[0];
            int age = Integer.parseInt(args[1]);
            float interest = 0.0f;
            if(gender.equalsIgnoreCase("female"))
                interest = age<=58?8.2f:9.2f;
            else
                interest = age<=58?8.4f:10.5f;
            System.out.println(gender+" "+interest+"%");
        }
        else
            System.out.println("No values passed");
    }    
}
