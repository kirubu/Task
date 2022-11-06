import java.util.Scanner;
public class ColorCode 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        sc.close();
        switch(code)
        {
            case "O":
                System.out.println("Orange");
            break;
            case "Y":
                System.out.println("Yellow");
            break;
            case "R":
                System.out.println("Red");
            break;
            case "B":
                System.out.println("Blue");
            break;
            case "W":
                System.out.println("White");
            break;
            case "G":
                System.out.println("Green");
            break;
            default:
                System.out.println("Invalid code");
            break;
        }

    }
}
