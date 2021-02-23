package javaendoffile;

import java.util.Scanner;

public class javaendoffile {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    for(int i=1; scan.hasNext()!=false;i++){
        System.out.println(i +" "+scan.nextLine());
    }
    }
}
