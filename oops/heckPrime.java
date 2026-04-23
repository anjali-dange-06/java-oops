package oops;
import java.util.Scanner;
public class heckPrime {
    int count = 0;
    String check(int num) {
        count = 0; // reset count
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "It is Prime";
        } else {
            return "It is Not Prime";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        heckPrime obj = new heckPrime();
        String result = obj.check(num);
        System.out.println(result);
    }
}