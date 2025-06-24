package core;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while (number!=0){
            reversedNumber = reversedNumber*10+number%10;
            number=number/10;
        }

        if(originalNumber==reversedNumber){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Noooooo   "+reversedNumber);
        }


    }
}
