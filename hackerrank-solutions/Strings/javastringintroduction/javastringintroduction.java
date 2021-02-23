package javastringintroduction;
import java.io.*;
import java.util.*;

public class javastringintroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int Alength = A.length();
        int Blength = B.length();
        
        System.out.println(Alength+Blength);
        
        int Afirst = (int) A.charAt(0);
        int Bfirst = (int) B.charAt(0);
        
        if(Afirst > Bfirst){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        
            System.out.println(A+" "+B);
        
        
    }
}



