package javastringtokens;

import java.io.*;
import java.util.*;

public class javastringtokens {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().length() == 0 || s.length() > 400000) {
            System.out.println(0);
            return;
        }
        String delims = "[ .,!?_'@]+";
        String[] tokens = s.trim().split(delims);
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

        scan.close();
    }
}


