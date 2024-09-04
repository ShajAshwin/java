import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum=1;

        while (input>0){

            System.out.print(input+"*");
            sum=sum*(input);
            input=input-1;


        }
        System.out.print(" = "+sum);
    }
}
