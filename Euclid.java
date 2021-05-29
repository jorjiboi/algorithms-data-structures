import java.util.Scanner;

public class Euclid {

    public static int gcd (int m, int n) {
        if (n == 0){
            return m;
        }
        else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner firstNum = new Scanner(System.in);
        String mFake = firstNum.nextLine();
        String nFake = firstNum.nextLine();

        int m = Integer.parseInt(mFake);
        int n = Integer.parseInt(nFake);
        int r = gcd(m, n);

        System.out.println("gcd(" + m + " " + n + ") = " + r);


    }
}
