public class MinSubArraySum {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,8,9,2,5,10,13};
        int N = arr.length;
        int minSum = Integer.MAX_VALUE;
        for(int start =0;start<N; start++){
            int sum = 0;
            for(int end = start; end <N; end++){
                sum = sum + arr[end];
                minSum = (int) Math.min(sum, minSum);
            }
        }

        System.out.println(minSum);
    }
}
