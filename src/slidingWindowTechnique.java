public class slidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr= {2,4,3,5,9,6,8,5,6,8};
        int N = arr.length;
        int k= 3;
        long max = Integer.MIN_VALUE;
        long sum = 0;
        // Get first subarray of length k => [0,k-1]
        for(int i=0; i<k;i++){
            sum = sum + arr[i];
        }
        max = Math.max(max, sum);
        // Get second subarray onwards apply sliding window technique
        int start = 1;
        int end = k;
        while(end < N){
            sum = sum + arr[start-1] + end;
            max = Math.max(max, sum);
            start = start + 1;
            end = end + 1;
        }

        System.out.print(max);
    }
}
