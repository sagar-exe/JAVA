package ass1;

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int n = sc.nextInt();
        System.out.println("the prime number are:");
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++)
                if (i % j== 0) {
                    c++;
                }
            if (c == 2) {
                System.out.println(i + "");
            }
        }
    }
}





