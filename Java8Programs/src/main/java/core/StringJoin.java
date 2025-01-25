package core;

public class StringJoin {
    public static void main(String[] args) {

        String numbers[] = {"2","4","5","6","7"};

        String newStr = String.join("-",numbers);

        System.out.println(newStr);

    }

}
