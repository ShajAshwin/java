package core;

public class FibonacciNumber {
    public static void main(String[] args) {
        int limit = 10;
        int first = 0;
        int second = 1;

        for(int i=0;i<=limit;i++){
            int next = first+second;
            System.out.println(first);
            first=second;
            second=next;

        }
    }
}
