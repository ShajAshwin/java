import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int count =0;

        if(input>1){
            for(int i=2;i<=input;i++){
                if(input%i==0){
                    count++;
                }
            }

        }else System.out.println("Numbers below 2 are not prime numbers");

        if(count==1) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");


    }
}
