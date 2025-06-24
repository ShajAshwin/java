package hackerrank;

public class FindEquilibriumIndex {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3,5,6,-11};
        System.out.println(findEquilibriumIndex(arr));

    }

    public static int findEquilibriumIndex(int[] arr){
        int totalSum = 0;
        for(int a : arr){
            totalSum += a;
        }

        int leftSum = 0;
        for (int i=0;i< arr.length;i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(rightSum == leftSum) return arr[i];

            leftSum += arr[i];
        }

        return -1;

    }

}
