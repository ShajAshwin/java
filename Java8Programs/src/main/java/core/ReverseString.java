package core;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String newString = "";

        for(int i=str.length()-1;i>=0;i--){
            newString += str.charAt(i);
        }

        System.out.println(newString);
    }
}
