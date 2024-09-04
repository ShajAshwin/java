import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String originalInput=input;
        String rev="";

        for(int i=input.length()-1;i>=0;i--){
            rev = rev+input.charAt(i);
        }

        if(originalInput.equals(rev)) {
            System.out.println("It is a palindrome");
        } else System.out.println("Not a palindrome");

    }
}
