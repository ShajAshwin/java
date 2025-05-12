package core;

import java.util.Scanner;

public class CountOddAndEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int evenCount=0;
        int oddCount=0;

        while (input!=0){
            if(input%2==0) evenCount++;
            else oddCount++;

            input=input/10;
        }

        System.out.println("Even digits are "+evenCount);
        System.out.println("Odd digits are " +oddCount);



    }
}
