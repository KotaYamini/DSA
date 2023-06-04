/**
 * Given arr[N] elements and Q queries , each query contains L,R .For every query calculate, no.of even elements in arr[]
 * in range L -> R & print count.
 * constraints:
 * 1 <= N,Q <= 10^5
 * 1 <= A[i] <= 10^9
 * */
public class evenElementsPrefixSum { // TC: O(Q*N) SC:O(1)
    public static void main(String[] args) {
              // 0 1 2 3 4 5 6 7 8 9
    int[] arr = {2,3,4,7,8,9,6,9,10,4};
              // 3      2     3
    int[][] B= {{4,8}, {3,7}, {0,4}};

    // Idea-1: For every query, iterate from Left to Right indices, calculate count of even and print the count.
     RangeCount(arr, B);

    }

    static  void  RangeCount(int[] arr, int[][] mat){
        int N = arr.length;
        int Q = mat.length;
        int count = 0;
        //first modify the array even -> 1 ; odd -> 0
        for(int i=0; i<N; i++){
            if(arr[i] % 2 ==0){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }
        // creation of prefix sum
        int[] prefixSum = new int[N];
        prefixSum[0] = arr[0];
        for(int i=1; i<N; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i=0; i<Q; i++){
            int start = mat[i][0];
            int end = mat[i][1];
            int value = 0;
            if(start == 0){
                value = prefixSum[end];
            }else{
                value = prefixSum[end] -prefixSum[start-1];
            }
            count = value;
        }

        System.out.println(count);
    }
}
