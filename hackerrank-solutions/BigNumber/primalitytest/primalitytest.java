package primalitytest;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;

public class primalitytest {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();
        BigInteger Bn = new BigInteger(n);
        if(Bn.isProbablePrime(1))
                System.out.println("prime");
        else
                System.out.println("not prime");
       
    }
}
