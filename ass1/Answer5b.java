package ass1;

import java.util.Scanner;

public class Answer5b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the square length=:");
        int n=sc.nextInt();
        // System.out.println("enter the square length=:");
        // int m=sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (i == 1 || i == n ||
                    j == 1 || j == n)           
                    System.out.print("* ");           
                else
                    System.out.print("  ");           
            }
            System.out.println();
        }
      
    }
    }
    

