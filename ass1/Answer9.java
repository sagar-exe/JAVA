package ass1;
import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        float distance= sc.nextFloat();
        System.out.print("Input hour: ");
        float hour= sc.nextFloat();
        System.out.print("Input minutes: ");
        float minute= sc.nextFloat();
        System.out.print("Input seconds: ");
        float second= sc.nextFloat();
        float time=(hour*60*60)+(minute*60)+second;
        float distance1=distance/1000;
        float time2=hour+(minute/60)+(second/3600);
        float distance3=distance/1609;
        System.out.println("Your speed in meters/second is "+distance/time);
        System.out.println("Your speed in km/h is "+distance1/time2);
        System.out.println("Your speed in miles/h is "+distance3/time2);



    }
    
}
