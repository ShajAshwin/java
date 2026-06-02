package core;

import java.util.Scanner;

public class CountNumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int count = 0;

        while(input!=0){
            if(input>0) count++;
            input=input/10;
        }

        System.out.println("Total digit in given number is = "+ count);
        //test
    }
}
