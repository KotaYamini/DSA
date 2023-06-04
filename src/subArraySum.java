/*
* Given ar[N] elements, print each and every subArray sum.
* Note: print each subArray sum in new line
*
* constraints:
* 1<=N<=10^3
* 1<=arr[i] <=10^5
* */

public class subArraySum {
    public static void main(String[] args) {
    int[] arr = {3,4,6,7,8,9,2,5,10,13};
    int N = arr.length;

        // TC: O(N^3) SC:O(N)
        for(int start=0; start<N; start++){
            for(int end = start; end<N; end++){
                int sum = 0;
                //iterate from start to end ,to get subarray
                for(int i= start; i<=end; i++){
                    sum = sum + arr[i];
                }
              //  System.out.println(sum);
            }
        }

      //  prefixSumSubArray(arr);
        carryForwardSumOfAllSubArrays(arr);
    }

    public static  void prefixSumSubArray(int[] arr){ // TC:O(N+N^2) SC:O(1)
        int N = arr.length;
        //creating & iterating over prefix sum Array
        int[] psum = new int[N];
        psum[0] = arr[0];
        for(int i=1; i<N; i++){
            psum[i] = psum[i-1] + arr[i];
        }

        for(int start=0; start<N; start++){
            for(int end= start; end<N; end++){
                int sum = 0;
                if(sum == 0){
                    sum = psum[end];
                }else{
                    sum = psum[end] - psum[start-1];
                }
                System.out.println(sum);
            }
        }
    }

    // Using carry Forward approach for all  subArrays
    public static void carryForwardSumOfAllSubArrays(int[] arr){ // TC:O(N^2) SC:O(1)
        int N =arr.length;
        for(int start= 0;start<N; start++){
            int sum= 0;
            for(int end =start; end<N; end++){
                sum = sum + arr[end];
                System.out.println(sum);
            }
        }
    }
}


