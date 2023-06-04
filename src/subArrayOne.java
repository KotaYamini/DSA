/**
 * Given ar[N], print all subArrays, Print each subArray in new line
 * */

public class subArrayOne { // TC: O(N*N*N) => O(N^3) SC: O(1)
    public static void main(String[] args) {
        int[] arr= { 3,6,7,4,2,8};
        int N = arr.length;
        for(int start =0; start< N; start++){
            for(int end = start; end <N; end++){
                for(int i= start; i<end; i++){
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }

    }
}
