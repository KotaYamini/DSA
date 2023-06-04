/**
 * Given an arr[N] , you have to find number of leaders in arr[]
 * Note 1: arr[i] is said to be leader, if it's greater than > max of all elements on left
 * Note 2: arr[0] is considered as leader
 *
 * constraints:
 * 1 <= N <= 10^5
 * 1 <= ar[i] <= 10^9
 *  */


public class leaderCount { // TC: O(N) SC: O(1)
    public static void main(String[] args) {
        int[] arr = {4,3,2,9,7,10};
        int N = arr.length;
        // since arr[0] is treated as leader , then leader count should be taken as 1
        int max = arr[0]; int leader = 1;
        // as arr[0] is already taken into consideration , i will starts with 1
        for(int i=1; i<N; i++){
            if(arr[i] > max){
                leader = leader + 1;
                max = arr[i];
            }
        }
        System.out.println(leader);
    }



}
