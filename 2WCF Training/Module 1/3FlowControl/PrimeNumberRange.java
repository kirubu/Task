import java.util.Scanner;

class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range1 = sc.nextInt();
        int range2 = sc.nextInt();
        for (int i = range1; i <= range2; i++)
            if (isPrime(i))
                System.out.println(i);
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0 && ++count > 0);
        if (count == 0)
            return true;
        else
            return false;
    }
}
