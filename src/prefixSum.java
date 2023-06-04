/**
 * Given ar[N] elements and Q queries , each query contains left & right i.e., L&R.
 * For every query , caluclate sum of all index elements in ar[] from L & R & print Sum.
 * constraints:
 * 1 <= N,Q <= 10^5
 * 1 <= A[i] <=10^9
 * */

public class prefixSum { // TC: O(N+Q) SC: O(N)
    public static void main(String[] args) {

        // Idea-1: Iterate from L-> R and calculate the sum & print it TC: Q * N SC: O(1)
        int ar[] = {-3,6,2,4,5,2,8,-9,3,1};
        int[][] B= {{4,8},{3,7},{1,3},{7,7},{3,6},{0,4}};
        RangeSum(ar, B);

        System.out.println();
    }

    static void RangeSum(int ar[], int mat[][]){
        int N = ar.length;
        int Q = mat.length;
        int ans = 0;
        int psum[] = new int[N];
        psum[0] = ar[0];
        for(int i=1; i<N; i++){
            psum[i] = psum[i-1] + ar[i];
        }

        for(int i=0; i<Q; i++){
            int left = mat[i][0];
            int right = mat[i][1];
            int sum = 0;
            if(left == 0){
               sum = psum[right];
            }else{
                sum = psum[right] - psum[left-1];
            }
            ans = sum;
        }
        System.out.println(ans);
    }
}
