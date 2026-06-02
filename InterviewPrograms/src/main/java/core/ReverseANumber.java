package core;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int input = scan.nextInt();
        int rev = 0;

        while (input>0){
            rev = (rev*10) + input%10;
            input = input/10;
        }

        System.out.println("Reversed number is = "+rev);


    }
}
