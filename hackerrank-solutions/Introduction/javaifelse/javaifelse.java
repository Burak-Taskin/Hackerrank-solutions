package javaifelse;


import java.util.*;


public class javaifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans;
        scanner.close();

        if(n%2==1 || (n>=6 && n <= 20)){
            ans = "Weird";
        }else{
            ans = "Not Weird";
        }

        System.out.println(ans);

       
    }
}

