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

    for(int start=0; start<N; start++){
        for(int end = start; end<N; end++){
            int sum = 0;
            //iterate from start to end ,to get subarray
            for(int i= start; i<=end; i++){
                sum = sum + arr[i];
            }
            System.out.print(sum);
        }
    }
    }
}
