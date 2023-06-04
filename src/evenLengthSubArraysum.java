/**
 * No.of even length subarray sum with sum >= B
 * */

public class evenLengthSubArraysum {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,8,9,2,5,10,13};
        int N = arr.length;
        int count = 0;
        int B = 6;
        for(int start =0; start<N; start++){
            int sum =0;
            for(int end =start; end<N; end++){
                sum =  sum + arr[end];
                int length = start-end+1;
                if(length % 2 == 0 && sum >= B) {
                    count  =count +1;
                }
            }
        }
        System.out.println(count);
    }
}
