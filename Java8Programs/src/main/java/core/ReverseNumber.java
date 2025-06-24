package core;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int newNumber = 0;

        while(input!=0){
            newNumber = newNumber*10+input%10;
            input = input / 10;

        }

        System.out.println(newNumber);
    }
}
