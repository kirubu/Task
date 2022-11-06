import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, sum = 0;
        n = temp = sc.nextInt();
        while (n > 0) {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        System.out.println((sum == temp) ? temp + " is a palindrome" : temp + " is not a palindrome");
    }

}
