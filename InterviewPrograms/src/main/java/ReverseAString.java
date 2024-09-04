import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String rev = "";

        for(int i=input.length()-1;i>=0;i--){
            rev = rev+input.charAt(i);
        }

        System.out.println(rev);



    }
}
