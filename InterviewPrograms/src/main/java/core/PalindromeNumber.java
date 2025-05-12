package core;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int originalInput=input;
        int rev=0;


        while (input>0){
            rev = rev*10+input%10;
            input=input/10;
        }

        if(originalInput==rev) System.out.println("It is a palindrome");
        else System.out.println("Not a palindrome");

    }
}
