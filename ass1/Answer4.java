package ass1;

import java.util.Scanner;

public class Answer4 {
    public static void main(String[] args) {
        int sum=0;
        int rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("the integers are ");
        while (num!=0) {
            
            rem=num%10;
            System.out.println(rem);
            sum+=rem;
            num/=10;


            
        }
        System.out.println("the sum is "+sum);

    }
    //how to add global email and name to git
    //git config ==list
    
}
