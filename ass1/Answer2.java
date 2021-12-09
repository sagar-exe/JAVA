package ass1;

import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;

public class Answer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String st=sc.next();
        String reverse="";
        for(int i=st.length()-1;i>=0;i--){
        reverse=reverse+st.charAt(i);
        }
        if(st.equals(reverse))
            System.out.println("palindrome");
        else 
            System.out.println("not palindrome");
        

    }

}
