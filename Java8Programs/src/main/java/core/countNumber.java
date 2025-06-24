package core;

public class countNumber {
    public static void main(String[] args) {

        int number = Integer.valueOf(12345678);
        int count=0;

        while (number!=0){
            number = number/10;
            count++;
        }

        System.out.println(count);

    }
}
