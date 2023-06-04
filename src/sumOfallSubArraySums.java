/**
 * Given an arr[N] elements, return sum of all subarray's sum.
 * */

public class sumOfallSubArraySums {

    public static void main(String[] args) {
        int[] arr = {3,6,8,9,4,5,6,7};

        System.out.println(subSums(arr));
    }
    public  static  long subSums(int[] arr){
        long total = 0;
        int N = arr.length;

        for(int start = 0; start < N; start++){
            int sum = 0;
            for(int end=start; end<N; end++){
                sum = sum + arr[end];
                total = total + sum;
            }
        }
        return  total;
    }
}
