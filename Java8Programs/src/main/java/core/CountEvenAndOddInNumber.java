package core;

import java.util.Scanner;

public class CountEvenAndOddInNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int evenCount = 0;
        int oddCount  = 0;

        while(input!=0){
            if((input%10)%2==0){
                evenCount++;
                input=input/10;
            }else {
                oddCount++;
                input=input/10;
            }
        }

        System.out.println("Even Count " + evenCount);
        System.out.println("Odd Count "  + oddCount);



    }
}
