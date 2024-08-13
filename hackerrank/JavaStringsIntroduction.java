//Find the challenge statement here: https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        // Suma lenght A y B
        System.out.println((A.length())+(B.length()));
        
        // Determine lexicogrphic order
        
        boolean lexOrder = false;
        
        int minLen = Math.min(A.length(), B.length());
        for( int i = 0; i < minLen; i++){
            char a = A.charAt(i);
            char b = B.charAt(i);
            if((int) a > (int) b){
                lexOrder = true;
                break;
            } else if ((int)a < (int)b){
                break;
            }
        }
        
        if(lexOrder){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        
        //Capitalize and join strings
        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " ");
        System.out.print(B.substring(0,1).toUpperCase() + B.substring(1));
        
    }
}
