package javasubstringcomparisons;

import java.util.Scanner;

public class javasubstringcomparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int length = s.length();
        
        for(int i=0;i<length-k+1;i++){
            String temp = s.substring(i,i+k);
            if( i == 0|| temp.compareTo(smallest)<0)
                smallest = temp;
            if(i == 0 || temp.compareTo(largest)>0){
                largest = temp;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}