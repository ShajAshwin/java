public class FibonacciSeries {
    public static void main(String[] args) {
        int a=1, b=0, sum=0;

        for(int i=0;i<=10;i++){
            System.out.print("  "+sum+"  ");
            sum=a+b;
            a=b;
            b=sum;

        }
    }
}
