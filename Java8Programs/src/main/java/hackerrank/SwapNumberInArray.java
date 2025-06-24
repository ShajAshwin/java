package hackerrank;

import java.util.Arrays;

//swap alternative elements in array
public class SwapNumberInArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int n = 7;
        swapArray(n,array);

    }

    public static void swapArray(int n, int[] array){

        for(int i=0;i<array.length-1;i+=2){
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
