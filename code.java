import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        } 
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int result=factorial(n);
        System.out.println(result);
    }
}
