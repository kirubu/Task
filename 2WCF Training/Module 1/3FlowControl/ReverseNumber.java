import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }

    }
}
